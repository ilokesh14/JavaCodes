import java.io.File;
import java.io.IOException;

public class ThrowThrowsFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/test123/Sample.txt";
		
		File file = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Some Problem in File Creation...");
		}
		//int x = 100/0; //throw new ArithmeticException();
		System.out.println("this line never execute...");
		
		
	}

}
