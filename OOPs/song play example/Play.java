import java.io.File;

import jaco.mp3.player.MP3Player;

public class Play {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//  c:\\songs\\E.mp3 In windows,we have to give path with 2 backward slashes while in linux we use forward slashes .
		// c:\songs\E.mp3 and hence the window interprets it as single slash,bcoz one is escaped .
		File file = new File("/Users/amit/Documents/songs/E.mp3");
		MP3Player mp3 = new MP3Player(file);
		mp3.play();
		System.out.println("Main Is Going to Sleep");
		Thread.sleep(15000);
		System.out.println("Main Awake");

	}

}
