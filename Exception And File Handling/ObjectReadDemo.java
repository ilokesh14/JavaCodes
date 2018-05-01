import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;




public class ObjectReadDemo {
	
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/FileOutput/emp.dat";
		FileInputStream fs = new FileInputStream(path); // Read Bytes
		ObjectInputStream is = new ObjectInputStream(fs); // Convert Bytes into Object
		FullTimeEmp emp = (FullTimeEmp)is.readObject(); // Deserialization
		System.out.println(emp);
		is.close();
		fs.close();

	}

}
