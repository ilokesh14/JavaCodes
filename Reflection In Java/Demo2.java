import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

interface B1{
	
}
interface B2{
	
}
class B{
	
}
class A1 extends B implements B1, B2{
	private int x;
	int y;
	private int z;
	static int d;
	final int f=100;
	void show() {
		
	}
	void display() {
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A1();
		int z = obj.y ; // Data
		Field fields[] = A1.class.getDeclaredFields();
		//Field fields [] = obj.getClass().getDeclaredFields();
		System.out.println(fields.length);
		int privateCounter=0;
		for(Field f : fields) {
			if(Modifier.isPrivate(f.getModifiers())) {
				privateCounter++;
			}
		}
		System.out.println("Private "+privateCounter);
		System.out.println(obj.getClass().getSuperclass().getSuperclass().getName());
		Class cls [] = obj.getClass().getInterfaces();
		for(Class c : cls) {
			System.out.println(c.getName());
		}
	}

}












