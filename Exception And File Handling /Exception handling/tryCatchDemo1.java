
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x [] = {10,20,30};
		System.out.println("i Will run...");
		//x[5] = 100; // throw new ArrayIndexOutOfBoundException()
		//int a = 100/0; // throw new ArithmeticException()
		String a = null;
		try {
		a.toUpperCase(); // throw new NullPointorException()
		}
		catch(NullPointerException e) {
			System.out.println("Value is Null Can't do Uppercase");
		}
		System.out.println("I will never run");
		//NullPointerException e;

	}

}
