import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	private static BufferedImage bg;
	static
	{
		loadImage();
	}
public static void loadImage(){
	try {
		 bg = ImageIO.read(ImageLoader.class.getResource("ryu.png"));
	}
	catch (IOException e) {
		e.printStackTrace();
	}

}
public static BufferedImage[] loadPower() {
	BufferedImage bArray [] = new BufferedImage[4];
	bArray[0] = bg.getSubimage(25, 14, 70-25, 98-14) ;
	bArray[1] = bg.getSubimage(77, 28, 170-77, 98-28) ;
	bArray[2] = bg.getSubimage(171, 30, 263-171, 101-30) ;
	bArray[3] = bg.getSubimage(268, 31, 368-268, 101-31) ;
	return bArray;
}

public static BufferedImage[] loadDefault() {
	BufferedImage bArray [] = new BufferedImage[2];
	bArray[0] = bg.getSubimage(25, 14, 70-25, 98-14) ;
	bArray[1] = bg.getSubimage(383,17,443-383,102-17) ;
	
	return bArray;
}
}









