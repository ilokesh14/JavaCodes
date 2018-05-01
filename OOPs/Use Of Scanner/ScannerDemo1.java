import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the Name ");
		String name =scanner.nextLine();
		System.out.println("Name is "+name);
		scanner.close();  // scanner close as well as System.in close
		System.out.println("Enter the City");
		scanner = new Scanner(System.in);
		String city = scanner.next();
		System.out.println("City is "+city);
	}

}
