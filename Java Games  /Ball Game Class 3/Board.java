import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants, ActionListener{
private int x = 10;
private int y = 10;
int speed ;
private Ball[] balls = new Ball[MAX_BALLS];
private void loadBalls() {
	for(int i= 0; i<MAX_BALLS; i++) {
		balls[i] = new Ball();
	}
}
private void checkCollision() {
	for(int i =0; i<balls.length-1; i++) {
		for(int j = i + 1; j<balls.length; j++) {
			if(isCollide(balls[i], balls[j])) {
				balls[i].setxSpeed(balls[i].getxSpeed()*-1);
				balls[i].setySpeed(balls[i].getySpeed()*-1);
				balls[j].setxSpeed(balls[j].getxSpeed()*-1);
				balls[j].setySpeed(balls[j].getySpeed()*-1);
				
			}
		}
	}
}
private boolean isCollide(Ball firstBall, Ball secondBall) {
	int xDistance = Math.abs(firstBall.getX() - secondBall.getX());
	int yDistance = Math.abs(firstBall.getY() - secondBall.getY());
	return xDistance<=firstBall.getW() 
			&& yDistance<=firstBall.getH();
}
int ySpeed;
	public Board() {
		loadBalls();
		System.out.println(balls.length);
		for(Ball ball : balls) {
			System.out.println(ball.getX()+ " "+ball.getY()+" "+ball.getxSpeed()+" "+ball.getySpeed());
		}
	setSize(GWIDTH,GHEIGHT);
	setBackground(Color.BLACK);
	//ySpeed = speed = 5;
	gameLoop();
	
}
private Timer timer ;
//private Ball ball = new Ball();
@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	checkCollision();
	//ball.move();
	//ball.changeDirection();
	//move();
	//changeDirection();
}

public void gameLoop() {
	timer = new Timer(DELAY,this);
	timer.start();
}
//public void changeDirection() {
//	if(x>=GWIDTH-50) {
//		speed = speed * -1;
//	}
//	else
//	if(x<=0) {
//		speed = speed * -1;
//	}
//	if(y>=GHEIGHT-50) {
//		ySpeed = ySpeed * -1;
//	}
//	else
//	if(y<=0) {	
//		ySpeed = ySpeed * -1;
//	}
//}
//public void move() {
//	
//	x+=speed;
//	y+=ySpeed;
//}
private void drawBalls(Graphics g) {
	for(Ball ball : balls) {
		ball.drawBall(g);
		ball.move();
		ball.changeDirection();
	}
}

@Override
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	drawBalls(g);
	//ball.drawBall(g);
//	g.setColor(Color.YELLOW);
//	g.fillOval(x, y, 50, 50);
	
}

}






