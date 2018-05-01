import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstants{
	
	int acc;
	final int GRAVITY = 1;
	boolean isJumped ;
	int currentState ;
	BufferedImage powerSprite[] ;
	BufferedImage defaultSprite[] ;
	
	
	public int getCurrentState() {
		return currentState;
	}
	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}
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
	private int currentDefaultIndex = 0;
	int timePass = 0;
	private void drawDefaultMove(Graphics g) {
		if(currentDefaultIndex<defaultSprite.length) {
			g.drawImage(defaultSprite[currentDefaultIndex],x,y,w,h,null);
			timePass++;
			if(timePass>=3) {
			currentDefaultIndex++;
			timePass = 0;
			}
			
		}
		else {
			currentDefaultIndex = 0;
			currentState = DEFAULT;
			timePass  = 0;
		}
	}
	
	private int currentPowerIndex = 0;
	private void drawPower(Graphics g) {
		if(currentPowerIndex<powerSprite.length) {
			g.drawImage(powerSprite[currentPowerIndex],x,y,w,h,null);
			timePass++;
			if(timePass>=3) {
				currentPowerIndex++;
			timePass = 0;
			}
			
		}
		else {
			timePass = 0;
			currentPowerIndex = 0;
			currentState = DEFAULT;
		}
	}
	
	public void drawPlayer(Graphics g) {
		if(currentState==DEFAULT) {
			drawDefaultMove(g);
		}
		else if(currentState==POWER){
			drawPower(g);
		}
		//g.drawImage(image, x, y, w, h, null);
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
		currentState = DEFAULT;
		powerSprite = ImageLoader.loadPower();
		defaultSprite = ImageLoader.loadDefault();
		//image = new ImageIcon(Player.class.getResource(PLAYER_IMAGE)).getImage();
	}

}
