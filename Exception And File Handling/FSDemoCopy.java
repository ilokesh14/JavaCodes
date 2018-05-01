import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FSDemoCopy {
	
	public static String readAllBytes(FileInputStream fs) throws IOException {
		final int EOF = -1;
		int singleByte = fs.read();
		StringBuilder sb = new StringBuilder();
		while(singleByte!=EOF) {
			sb.append((char)singleByte);
			//System.out.print((char)singleByte);
			singleByte = fs.read();
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path  = "/Users/amit/Documents/JavaBatch11Wend/ExceptionDemo/src/FSDemo.java";
		FileInputStream fs = null;
		String targetPath = "/Users/amit/Documents/JavaBatch11Wend/ExceptionDemo/src/FSDemoCopy.java";
		FileOutputStream fo =null;
		try {
		 fs = new FileInputStream(path);
		  fo = new FileOutputStream(targetPath,true);
		 String t = readAllBytes(fs);
		 System.out.println(t);
		 fo.write(t.getBytes());
		 System.out.println("Copy Created...");
		
		 //byte arr[] = fs.readAllBytes();
		//String t  = new String(arr);
		//System.out.println(t);
		
		}
		catch(FileNotFoundException e) {
			System.out.println("path is wrong....");
		}
		catch(IOException e) {
			System.out.println("Can't read this file");
		}
		finally {
			if(fs!=null) {
				try {
			fs.close();
			if(fo!=null) {
				fo.close();
			}
				}
				catch(IOException e) {
					System.out.println("Unable to close the file...");
				}
			}
		}
		
	}

}











