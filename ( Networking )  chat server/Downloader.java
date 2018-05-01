import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Downloader {

	static String getFileName(String url) {
		int index = url.lastIndexOf("/");
		String fileName  = url.substring(index+1);
		return fileName;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String downloadLocation = "/Users/amit/Documents/FileOutput/download";
		//Scanner s = new Scanner(System.in);
		//String urlName  = s.next();
		//String urlName = "http://awallpapersimages.com/wp-content/uploads/2016/09/Sachin-Tendulkar-HD-Wallpapers-1.jpg";
		String urlName = "http://www.brain-mentors.com/";
		URL url = new URL(urlName);
		URLConnection connection = url.openConnection();
		connection.connect();  // request to the server
		InputStream is = connection.getInputStream();
		byte arr[] = is.readAllBytes();
		//File file = new File(downloadLocation+"/"+getFileName(urlName));
		File file = new File(downloadLocation+"/test.html");
		FileOutputStream fs= new FileOutputStream(file);
		fs.write(arr);
		fs.close();
		System.out.println("Downloaded....");
	}

}

















