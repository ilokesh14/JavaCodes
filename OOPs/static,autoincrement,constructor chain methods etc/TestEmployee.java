import java.util.Scanner;

class A{
	static {
		System.out.println("A Class Loaded.");
	}
}
public class TestEmployee {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String className ;
		System.out.println("Enter the ClassName to Load in Memory");
		Scanner scanner= new Scanner(System.in);
		className = scanner.next();
		Class.forName(className);
		//System.out.println("Total Objects are "+Employee.counter);
		//Employee ram =new Employee();
		/*
		Employee ram = new Employee( "RAM", 9000);
		
		ram.printSalarySlip();
Employee shyam = new Employee( "Shyam", 9000);
		
		shyam.printSalarySlip();
		
		System.out.println("Total Objects are "+Employee.counter);
*/
	}

}
