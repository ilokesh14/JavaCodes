class MyPrinter{
	private static MyPrinter obj ;
	
	private MyPrinter() {}
	public static MyPrinter getInstance() {
		if(obj==null) {
			obj = new MyPrinter();
		}
		return obj;
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		MyPrinter  p = MyPrinter.getInstance();
		MyPrinter  p2 = MyPrinter.getInstance();
		System.out.println(p==p2);
		
		
		// TODO Auto-generated method stub
		//MyPrinter obj = new MyPrinter();
	}

}
