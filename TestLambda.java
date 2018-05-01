interface SAM{
	int add(int x, int y);
}
//class TestLambda$1 implements SAM{
//	
//}
public class TestLambda  {

	public static void main(String[] args) {
		SAM obj3 = new SAM() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		
		SAM obj4 = new SAM() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		// TODO Auto-generated method stub
		SAM obj = (a,b)->a+b;
		SAM obj2 = (a,b)->{
			System.out.println("A is "+a+" and B is "+b);
			return a + b;
		};
		System.out.println(obj.add(10, 20));
		System.out.println(obj2.add(100, 200));

	}

	

}
