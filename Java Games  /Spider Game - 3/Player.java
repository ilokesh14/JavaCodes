import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstants{
	
	int acc;
	final int GRAVITY = 1;
	boolean isJumped ;
	public void jump() {
		if(!isJumped) {
		acc = -15;
		y+=acc;
		isJumped = true;
		}
	}
	public void fall() {
		if(y>=FLOOR-h) {
			isJumped=false; 
			y  = FLOOR - h;
			 return ;
		}
		acc +=GRAVITY;
		y+=acc;
	}
	
	public void drawPlayer(Graphics g) {
		g.drawImage(image, x, y, w, h, null);
		move();
	}
	
	public void move() {
		x+=speed;
	}
	
	

	public Player(){
		x = 30;
		w = h = 72;
		y = FLOOR - h ;
		speed = 0;
		
		image = new ImageIcon(Player.class.getResource(PLAYER_IMAGE)).getImage();
	}

}
