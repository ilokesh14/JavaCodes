import java.util.Scanner;
//final class V1{
class V1{
	int x; // default scope
	private final void show() {
		System.out.println("V1 Show");
	}
	void print() {  // default scope
		
	}
	
}
class V2 extends V1{
	//@Override
	void show() {
		
	}
}
class Temp{
	int x, y;
	final int z;
	Temp(){
		z = 100;
	}
//	void print() {
//		z = 100;
//	}
}

public class UseOfFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Temp obj =new Temp();
		obj.x++;
		obj.y++;
		//obj = new Temp();
		final double PI = 3.14;
		int x = 10;
		final int MIN_AGE = 18; 
		System.out.println("Enter the Age");
		int age = new Scanner(System.in).nextInt();
		if(age>=MIN_AGE) {
			System.out.println("Apply for DL");
		}
		else {
			System.out.println("U r a Minor U can't Apply");
		}

	}

}
