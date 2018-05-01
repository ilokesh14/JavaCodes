import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstants, ActionListener{
private int x = 10;
int speed ;
	public Board() {
	setSize(GWIDTH,GHEIGHT);
	setBackground(Color.BLACK);
	speed = 5;
	gameLoop();
	
}
private Timer timer ;

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
}

public void gameLoop() {
	timer = new Timer(DELAY,this);
	timer.start();
}

@Override
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.YELLOW);
	g.fillOval(x, 100, 50, 50);
	x+=speed;
}

}
