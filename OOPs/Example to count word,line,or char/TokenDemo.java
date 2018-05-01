import java.util.Scanner;

public class TokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int firstno = s1.nextInt();
		int secondNo = s1.nextInt();
		System.out.println("First No is "+firstno+" Second no is "+secondNo);
		int lineCount = 0;
		String text = "Hello How are You ? I am fine\n This is Test\n";
		Scanner s = new Scanner(text);
		int wordCount = 0;
		while(s.hasNextLine()) {
			//System.out.println(s.next());
			System.out.println(s.nextLine());
			//wordCount++;
			lineCount++;
		}
		System.out.println("Total Lines are "+lineCount);
		//System.out.println("Total Words are "+wordCount);
		/*Scanner scanner= new Scanner(System.in);
		ArrayList l = new ArrayList();
		while(true) {
			System.out.println("Enter the Name type quit to exit ");
			String name = scanner.nextLine();
			if(name.equals("quit")) {
				break;
			}
			l.add(name);
		}
		System.out.println("Names are "+l);
		scanner.close();
	*/
	}

}
