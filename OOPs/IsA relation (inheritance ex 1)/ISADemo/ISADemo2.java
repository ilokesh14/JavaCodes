class P1{
	int x = 1000;
}
class A1 extends P1
{
	int x =10;
	A1(){
		
		System.out.println("A1 Default Cons Call");
	}
	A1(int x){
		this();
		System.out.println("A1 Param Cons Call");
	}
}
class B extends A1{
	int x =20;
	int y;
	B(){
		
		super(200);
		y = 100;
		//super();
		System.out.println("B Default Cons Call");
	}
	B(int x){
		this();
		//this.x = x + y;
		int z = ((P1)this).x+((A1)this).x + this.x + x;
		//super(x);
		// super(); Implicit Call
		System.out.println("B Param Cons Call "+z);
		
	}
}
public class ISADemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(100);
	}	

}
