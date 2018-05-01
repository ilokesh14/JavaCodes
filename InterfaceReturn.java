interface T{
	int add(int x, int y);
}
class T2 implements T{
	public int add(int x, int y) {
		return x + y;
	}
}
public class InterfaceReturn {
	static T show() {
		//T e = (a,b)->a+b;
		//return e;
		T obj = new T2();
		return obj;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//T w = show();
		System.out.println(show().add(100, 200));
	}

}
