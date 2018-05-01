import java.util.Calendar;

class A2{
	void output() {
		class BB{
			BB(){
				System.out.println("BB Cons Call");
				
			}
			void show() {
				System.out.println("this is BB show Call");
			}
		}
		BB obj = new BB();
		obj.show();
	}
	static class C{
		static void display() {
			System.out.println("C Display");
		}
	}
	int x ;
	void print() {
		System.out.println("A2 print...");
	}
	A2(int x){
		this.x = x ;
		System.out.println("A2 Cons");
	}
	class B2{
		int x;
		B2(int x){
			this.x = x+ A2.this.x;
			System.out.println("B2 Cons "+this.x);
		}
		void show() {
			System.out.println("B2 show...");
		}
	}
	
}
public class InnerNestedDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2018, 2, 21);
		System.out.println(c.getTime());
		
		// TODO Auto-generated method stub
		//A2.C.display();
		//A2.B2 obj = new A2(100).new B2(200);
		//obj.show();
		A2 obj1 = new A2(100);
		obj1.output();
		//obj1.print();
//		A2.B2 obj2  = obj.new B2();
//		obj2.show();
	}

}
