import java.util.Scanner;

class A {
	int x = 100;
	int y = 200;
	@Override
	public String toString() {
		return "X is "+x+" and Y is "+y;
	}
}
public class DLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("Amit");
		System.out.println(a.toString());
		A obj = new A();
		System.out.println(obj.toString());
		System.out.println("Enter the Age");
		int age = new Scanner(System.in).nextInt();
		try {
		if(age<18) {
			throw new MinorAgeException(age);
			
		}
		System.out.println("U Can Apply for DL");
		System.out.println("U Can Apply for PanCard");
		}
		catch(MinorAgeException e) {
			System.out.println(e);
			//System.out.println(e.toString());
			//System.out.println("Can't Apply for DL Age is Less than 18");
		}
	

	}

	
	
	
	
	
	
	
	
	
}
