import java.util.InputMismatchException;
import java.util.Scanner;

public class Adder {
	static Scanner scanner = new Scanner(System.in);
	static int firstNumber;
	static int secondNumber;
	static void takeFirstNumber() {
		System.out.println("Enter the First Number");
		try {
		firstNumber = scanner.nextInt(); // throw new InputMisMatchException()
		}
		catch(InputMismatchException object) {
			System.out.println("Only number allowed in first number");
			scanner.nextLine();
			takeFirstNumber();
		}
	}
	
	static void takeSecondNumber() {
		System.out.println("Enter the Second Number");
		try {
		secondNumber = scanner.nextInt(); // throw new InputMisMatchException()
		}
		catch(InputMismatchException object) {
			System.out.println("Only number allowed in Second number");
			scanner.nextLine();
			takeSecondNumber();
		}
	}
	static void divide() {
		try {
			int result = firstNumber / secondNumber;
			System.out.println("Result is "+result);
			}
			catch(ArithmeticException e) {
				System.out.println("Can't Divide a number with zero");
				takeSecondNumber();
				divide();
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputMismatchException
		takeFirstNumber();
		takeSecondNumber();
		divide();
		
		scanner.close();

	}

}
