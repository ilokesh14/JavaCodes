import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {
	static Scanner scanner= new Scanner(System.in);
	static int firstNumber;
	static int secondNumber;
	static int result ;
	static void divide() {
		try {
		result = firstNumber/ secondNumber;
		}
		catch(ArithmeticException e) {
			System.out.println("U divide a number with zero");
			takeSecondNumber();
			divide();
		}
	}
	static void print() {
		System.out.println("Result is "+result);
	}
	static void takeSecondNumber() {
		System.out.println("Enter the Second Number");
		try { 
		secondNumber = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Only Number Allowed and U Enter SOmething Else...");
			scanner.nextLine();
			takeSecondNumber();
		}
		}
	static void takeFirstNumber() {
		System.out.println("Enter the First Number");
		try { 
		firstNumber = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Only Number Allowed and U Enter SOmething Else...");
			scanner.nextLine();
			takeFirstNumber();
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
//		System.out.println("Enter the Second Number");
//		int secondNumber =scanner.nextInt();
//		int result = firstNumber / secondNumber;
//		System.out.println("Result is "+result);
		takeFirstNumber();
		takeSecondNumber();
		divide();
		print();
		scanner.close();

	}

}
