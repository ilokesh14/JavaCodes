import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Camera  implements GameConstants {
	private static int x = 0;
	
	private static int speed =3;
	private static BufferedImage bg;
	static {
		loadImage();
	}
	public static void drawBg(Graphics g) {
		BufferedImage subImage = bg.getSubimage(x, 0, GWIDTH, GHEIGHT);
		g.drawImage(subImage, 0, 0, GWIDTH, GHEIGHT, null);
	}
	public static void left() {
		x-=speed;
	}
	public static void right() {
		x+=speed;
	}
	public static void loadImage() {
		try {
			bg =ImageIO.read(Camera.class.getResource("bg.jpg"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
