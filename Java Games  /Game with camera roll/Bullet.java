import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Sprite implements GameConstants {
boolean isVisibile ;	
public Bullet(int x, int y) {
	w = h = 10;
	this.x = x ;
	this.y = y;
	this.speed = 10;
	this.isVisibile =true;
}
public void outOfScreen() {
	if(x>=GWIDTH) {
		isVisibile= false;
	}
}
public void move() {
	x+=speed;
	outOfScreen();
}
public void drawBullet(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillOval(x, y, w, h);
	move();
}
}
