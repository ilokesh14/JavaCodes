class Shape{
	void draw() {
		
	}
	void area() {
		System.out.println("Generic Shape Area...");
	}
}
class Rectangle extends Shape{
	int l ,b;
	@Override
	void area() {
		
		System.out.println(l*b);
	}
	void per() {
		
	}
}
class Square extends Shape{
	
	void area() {
		
	}
	void allSideEquals() {
		
	}
}
public class DrawingISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
