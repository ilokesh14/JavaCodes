import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Press 1 for English");
		System.out.println("हिंदी के लिए 2 दबाएं");
		Scanner scanner= new Scanner(System.in);
		int choice = scanner.nextInt();
		Locale locale = null;
		if(choice == 1) {
			locale = new Locale("en","US");
		}
		else
		if(choice ==2) {
			locale = new Locale("hi","IN");
		}
		ResourceBundle r = ResourceBundle.getBundle("messages",locale);
		System.out.println(r.getString("firstno"));
		int firstNumber = scanner.nextInt();
		System.out.println(r.getString("secondno"));
		int secondNumber = scanner.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println(r.getString("result")+" "+sum);
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formatted = nf.format(sum);
		System.out.println(r.getString("result")+" "+formatted);
		scanner.close();
		Date d = new Date();
		System.out.println(d);
		DateFormat df = DateFormat.
				getDateInstance(DateFormat.FULL, locale);
		String formattedDate = df.format(d);
		System.out.println("Now Date is "+formattedDate);
		
	}

}
















