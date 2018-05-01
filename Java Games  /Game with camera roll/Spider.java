import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Spider extends Sprite implements GameConstants {
	boolean isDead;
	public Spider(int x,int speed) {
		y = 100;
		this.x = x;
		w = h = 100;
		this.speed = speed;
		this.image = 
				new ImageIcon(Spider.class.getResource(SPIDER_IMAGE))
				.getImage();
		
	}
	public void drawSpider(Graphics g) {
		g.drawImage(image, x, y, w, h, null);
		move();
	}
	public void move() {
		y+=speed;
		changeDirection();
	}
	public void changeDirection() {
		if(y>=(GHEIGHT-h)) {
			speed = speed * -1;
		}
		else
		if(y<=0) {	
			speed = speed * -1;
		}
	}
}
