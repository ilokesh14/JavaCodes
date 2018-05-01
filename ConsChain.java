class Parent
{
	int x;
	int y;
	Parent(){
		x = 100;
		y = 200;
		System.out.println("Parent Cons Call "+x +" "+y);
	}
	Parent(int x, int y){
		this();
		this.x = x;
		this.y = y;
		System.out.println("this is parent param cons "+this.x + " "+this.y);
	}
}
class Child extends Parent{
	int z ;
	Child(){
		super(1,2);
		//super();
		z = x + y;
		System.out.println("Child Cons Call "+z);
	}
	Child(int z){
		// super();
		this();
		//super(1,2);
		this.z  = z + x + y;
		System.out.println("Child Param Cons Call "+this.z);
	}
}
public class ConsChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(1000);

	}

}
