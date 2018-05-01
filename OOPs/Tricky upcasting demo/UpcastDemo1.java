class A1
{
	int x=100;
	void show() {
		System.out.println("A Show Call");
	}
}
class B extends A1{
	int x = 200;
	void show() {
		System.out.println("B Show Call "+x);
	}
}
public class UpcastDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object created of child class of parent type class 
 
		A1 a = new B();
		a.show();
		//Hence show method is called of child class hence the output will be : B show call 200
		System.out.println(a.x);
		//Here a.x calls the value of x for a i.e.the perent class variable x : 100
	}

}

/*
output : B show call 200
	 100
*/	 
