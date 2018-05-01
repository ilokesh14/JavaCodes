import java.io.IOException;
import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		byte b [] = new byte[10];
//		int c = System.in.read(b);
//		System.out.println((char)c);
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Id");
//		int id = scanner.nextInt();
//		System.out.println("Enter the Name");
//		String name = scanner.next();
		int x = 90;
		Customer ram =new Customer(1001,"Ram");
		ram.setBalance(9000);
		System.out.println(ram.getBalance());
		ram.setBalance(ram.getBalance() + 1000);
		ram.print();
		//ram.Customer();
		//ram.Customer();
		//Customer ram = new Customer(id, name) ;
		//ram.id =-1001;
	//	ram.takeInput(id, name);
	//	ram.print();
		//ram.id = 1001;
		//ram.name="Ram";
		//System.out.println("Id is "+ram.id);
		//System.out.println("Name is"+ram.name);
//		Customer shyam = new Customer();
//		shyam.takeInput(1002, "Shyam");
//		shyam.print();
//		scanner.close();
//		/*shyam.id = 1002;
//		shyam.name = "Shyam";
//		System.out.println("Id is"+shyam.id);
//		System.out.println("Name is "+shyam.name);
		
	}

}
