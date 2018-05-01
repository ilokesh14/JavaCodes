import java.lang.instrument.Instrumentation;
class W
{
	int x  , y;
}
class M{
	
}
class B{
	String t ;
}
public class ObjectSize {

	public static void premain(String a, Instrumentation ins ) {
		System.out.println("A is "+a);
		W obj = new W();
		System.out.println("W Size is "+ins.getObjectSize(obj));
		System.out.println("M Size is "+ins.getObjectSize(new M()));
		System.out.println("B Size is "+ins.getObjectSize(new B()));
			System.out.println("Pre main");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
	}

}
