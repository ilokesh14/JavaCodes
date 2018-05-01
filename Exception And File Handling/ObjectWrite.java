import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable{
	String state;
	String city;
}
class Emp {//implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Address a = new Address();
	int id;
	double bonus;
	String name;
	double salary;
	int age;
	Emp(){
		System.out.println("Emp Default Cons Call");
	}
	Emp(int id , String name, double salary){
		//System.out.println("Cons Call");
		System.out.println(" Emp Cons Call");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = 21;
		this.bonus = 1000;
	}
	@Override
	public String toString() {
		return "Id "+id+" Name "+name+" Salary "+salary+" Age is "+this.age+" Bonus "+this.bonus;
	}
}
class FullTimeEmp extends Emp implements Serializable{
	String deptName="IT";
	FullTimeEmp(){
		
		super(101,"Ram",9999);
		System.out.println("FullTime Emp Cons Call");
	}
	@Override
	public String toString() {
		return super.toString()+" DeptName  "+deptName;
	}
	
}
public class ObjectWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int nn[] = {10,20,30,40,50};
		int ff [] = new int[10];
		System.out.println(ff);
		String name = "Amit";
		int x = 100;
		byte bb [] = name.getBytes();
		System.out.println(bb);
		FullTimeEmp ram = new FullTimeEmp();
		String path = "/Users/amit/Documents/FileOutput/emp.dat";
		FileOutputStream fs = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ram);  // Convert Object into Bytes
		os.close();
		fs.close();
		System.out.println("Done....");
		
	}

}














