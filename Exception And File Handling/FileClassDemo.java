import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

class MyFilter implements FilenameFilter{
	private String ext;
	MyFilter(String ext){
		this.ext = ext;
	}

	@Override
	public boolean accept(File dirPath, String fileName) {
		// TODO Auto-generated method stub
		//System.out.println(dirPath +" "+fileName);
		return fileName.endsWith(ext);
	}
	
}
public class FileClassDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Extension...");
		String ext = s.next();
		String path = "/Users/amit/Documents/FileOutput";
		File file = new File(path);
		if(file.exists()) {
			File files [] = file.listFiles(new MyFilter(ext));
			for(File f : files) {
				if(f.isFile()) {
					System.out.println(f.getAbsolutePath());
					int index = f.getName().lastIndexOf(".");
					//System.out.println(f.getAbsolutePath());
					//System.out.println(f.getName().lastIndexOf("."));
					//String fileNameWithOutExt = f.getName().substring(0,index);
					//System.out.println(fileNameWithOutExt);
//					String newPath = path+"/"+fileNameWithOutExt+".haha";
//					System.out.println(newPath);
//					File ren = new File(newPath);
//					f.renameTo(ren);
//					if(f.isHidden()) {
//						
//					}
//					if(!f.canWrite()) {
//						
//					}
				}
				else
				if(f.isDirectory()) {
					
				}
				
				//f.renameTo(dest)
				//f.delete();
			}
		}
		
//		if(file.exists()) {
//			path = "/Users/amit/Documents/FileOutput"+"/a/b/c/honeysingh.mp3";
//			file = new File(path);
//			//file.mkdirs();
//			file.createNewFile();
//		}

	}

}
