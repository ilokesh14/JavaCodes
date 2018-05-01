class GrandParent{
	int x;  // Instance Variable
	
	//GrandParent calss default cons
	GrandParent(){
		System.out.println("GP Default Cons Call");
	}

	//GrandParent class param cons	
	GrandParent(int x){
		System.out.println("GP Param Cons Call");
		this.x = x; // instance variable x = method variable x 
	}
}

class Parent extends GrandParent{
	int x;  // Instance Variable
	
	//Parent class default cons
	Parent(){
		System.out.println("parent Default Cons Call");
	}

	//Parent class param cons
	Parent(int x){
		super(x); // super(x) calls its parent class param cons .  
		System.out.println("parent Param Cons Call");
		this.x = super.x + x; //instance var x = parent class var x + method variable x .
	}
}
class Child extends Parent{
	int x;  // Instance Variable
	
	//child class default cons
	Child(){
		System.out.println("Child Default Cons Call");
	}

	//child class param cons
	Child(int x){
		super(x); //super(x) calls its parent class param cons .  
		//GrandParent t = this;
		System.out.println("Child Param Cons Call");
		System.out.println("Parent x "+((Parent)this).x);
		System.out.println("GP X "+ ((GrandParent)this).x);
		this.x =super.x + ((GrandParent)this).x + x; // instance var x = parent class instance var x + grandParent class 								     // instance var x + method var x .
		System.out.println("X is "+this.x);
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(10);
	}

}


// output is 40 .
