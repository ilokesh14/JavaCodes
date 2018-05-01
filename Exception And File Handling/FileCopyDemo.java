import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int EOF = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Source Path");
		String sourcePath = scanner.next();
		System.out.println("Enter the Target Path");
		String targetPath = scanner.next();
		File file = new File(sourcePath);
		
		if(file.exists()) {
		FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fs,10000);
		FileOutputStream fo = new FileOutputStream(targetPath);
		BufferedOutputStream bo = new BufferedOutputStream(fo,10000);
		System.out.println("File Exist....");
		System.out.println("File Copy Start.....");
		long startTime = System.currentTimeMillis();
		int singleByte = bs.read();
		while(singleByte!=EOF) {
			bo.write(singleByte);
			singleByte = bs.read();
		}
		bs.close();
		bo.close();
		fs.close();
		fo.close();
		long endTime = System.currentTimeMillis();
		System.out.println("File Copy Done...." +(endTime-startTime)+"ms");
		}
		else {
			System.out.println("Can't Do Copy....");
			file.createNewFile();
			System.out.println("File Created...");
		}

	}

}








