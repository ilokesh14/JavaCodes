import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
class A{
	static {
		System.out.println("A Class is Loaded..");
	}
	A(){
		System.out.println("A Class Default Cons Call");
	}
}
class Calc{
	private int range = 100;
	public int x = 200;
	Calc(){
		System.out.println("Calc Class Cons Call....");
	}
	static {
		System.out.println("Calc Class is Loaded...");
	}
	public int add(int x , int y) {
		return x + y;
	}
	public int subtract(int x , int y) {
		return x - y;
	}
	public int multiple(int x , int y) {
		return x * y;
	}
	public int divide(int x , int y) {
		return x / y;
	}
}
public class CalcDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		//MyCalc obj = new MyCalc();
		//Object o = new Calc();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Calc name");
		String className = s.next();
		Object object = Class.forName(className).newInstance();
		System.out.println("Enter the Method Name");
		String methodName =  s.next();
		Method method = object.getClass()
				.getDeclaredMethod(methodName, int.class,int.class);
		Object result = method.invoke(object, 100,200);
		System.out.println("Result is "+result);
		System.out.println("Enter the Field Name");
		String fieldName = s.next();
		Field field = object.getClass().getDeclaredField(fieldName);
		field.setAccessible(true);
		System.out.println(field.get(object));
		//String m = "add(int x , int y)"
	}

}

















