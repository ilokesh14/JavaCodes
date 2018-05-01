import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SystemDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//System.nanoTime();
		long startTime = System.currentTimeMillis();
		int x=100;
		String path  ="/Users/amit/Documents/logs/test.txt";
		//System.setOut(new PrintStream(path));
		System.out.println("Hello Java");
		for(int i = 1; i<=100000;i++) {
		System.out.println("I is "+i);	
		}
		System.err.println("Error Found...");
		//System.out.printf("%d",x );
		long endTime = System.currentTimeMillis();
		System.out.println((endTime-startTime));
	}

}
