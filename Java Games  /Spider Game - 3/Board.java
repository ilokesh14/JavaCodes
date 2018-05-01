import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import jaco.mp3.player.MP3Player;

public class Board extends JPanel implements GameConstants {
	private Player player ;
	private Timer timer;
	private ArrayList<Bullet> bullets = new ArrayList<>();
	private Spider spiders[] = new Spider[MAX_SPIDERS];
	private void loadSpiders() {
		int x = GWIDTH/2-100;
		int speed = 2;
		for(int i = 0;i<spiders.length; i++) {
			spiders[i] = new Spider(x,speed);
			x = x + 200;
			speed = speed + 3;
		}
	}
	private void drawSpiders(Graphics g) {
		for(Spider spider : spiders) {
			if(!spider.isDead) {
			spider.drawSpider(g);
			}
		}
	}
	
	private boolean isCollide(Player player, Spider spider) {
		int maxWidth = Math.max(player.w, spider.w);
		int maxHeight = Math.max(player.h, spider.h);
		int xDistance = Math.abs(player.x-spider.x);
		int yDistance = Math.abs(player.y-spider.y);
		return xDistance<=maxWidth-50 && yDistance<=maxHeight-50;
	}
	private void checkCollision(Graphics g) {
		for(Spider spider : spiders) {
			if(isCollide(player, spider)) {
				gameOver(g);
				return ;
			}
		}
	}
	
	private void gameOver(Graphics g) {
		g.setColor(Color.RED);
		g.setFont(new Font("Arial",Font.BOLD,32));
		g.drawString("GAME OVER", GWIDTH/2, GHEIGHT/2);
		timer.stop();
	}
	
public Board() {
	setSize(GWIDTH,GHEIGHT);
	player = new Player();
	loadSpiders();
	gameLoop();
	
	setFocusable(true);
	bindEvents();
	playBackGround();
}

private void gameLoop() {
	ActionListener r = (e)->{
		repaint();
		player.fall();
	};
	timer= new Timer(DELAY,r);
//	timer  = new Timer(DELAY,(e)->{
//		repaint();
//	}) ;
	timer.start();
}

private void bindEvents() {
	this.addKeyListener(new KeyAdapter() {
//		public void keyTyped(KeyEvent e) {
//			System.out.println("Key Typed "+e.getKeyChar()+" "+e.getKeyCode());
//		}
		
		public void keyReleased(KeyEvent e) {
			player.setSpeed(0);
		}
		
		public void keyPressed(KeyEvent e) {
			int keyCode =  e.getKeyCode();
			if(keyCode == KeyEvent.VK_LEFT) {
				player.setSpeed(-5);
			}
			else
			if(keyCode == KeyEvent.VK_RIGHT) {
				player.setSpeed(5);
			}
			else
			if(keyCode == KeyEvent.VK_UP) {
				player.jump();
			}
			else
			if(keyCode == KeyEvent.VK_SPACE) {
				int bulletX = player.getX()+(player.getW()/2);
				int bulletY  = player.getY() + (player.getH()/2);
				Bullet bullet = new Bullet(bulletX,bulletY);
				bullets.add(bullet);
			}
			System.out.println("Key Pressed "+e.getKeyChar()+" "+e.getKeyCode());
		}
	});
}

private boolean isCollideBulletSpider(Bullet bullet , Spider spider) {
	int maxW = Math.max(spider.getW(), bullet.getW());
	int maxH = Math.max(spider.getH(), bullet.getH());
	int xDistance = Math.abs(spider.getX()-bullet.getX());
	int yDistance = Math.abs(spider.getY()-bullet.getY());
	return xDistance<=(maxW-50) && yDistance<=(maxH-25);
}

private void playBackGround() {
	MP3Player mp3 = new MP3Player(Board.class.getResource(BACKGROUND_SOUND));
	mp3.play();
}

private void checkBulletSpiderCollision() {
	for(Bullet bullet : bullets) {
		for(Spider spider:spiders) {
			if(isCollideBulletSpider(bullet, spider)) {
				spider.isDead = true;
			}
		}
	}
}

private void drawBullets(Graphics g) {
	for(Bullet bullet : bullets) {
		if(bullet.isVisibile) {
		bullet.drawBullet(g);
		}
	}
}

private void drawBackground(Graphics g) {
	Image bg = new ImageIcon(Board.class.getResource(BACKGROUND_IMAGE)).getImage();
	g.drawImage(bg, 0, 0, GWIDTH, GHEIGHT, null);
}
@Override
public void paintComponent(Graphics g) {
	drawBackground(g);
	player.drawPlayer(g);
	drawSpiders(g);
	checkCollision(g);
	drawBullets(g);
	checkBulletSpiderCollision();
}
}
