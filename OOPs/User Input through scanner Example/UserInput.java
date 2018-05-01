import java.util.Scanner;
class UserInput{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the Second number");
		int secondNumber = scanner.nextInt();
		int result = firstNumber + secondNumber;
		System.out.println("Sum is "+result);
		System.out.println("Enter your Name ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Your Name is "+name);
		scanner.close();
	}
}