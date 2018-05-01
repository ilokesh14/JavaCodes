interface Shape{
	void draw();
	void move();
}
class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle Draw...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Circle Move...");
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square Draw...");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Square Move");
	}
	
}
class Drawing{
	void drawShapes(Shape shape) {
		shape.draw();
		shape.move();
	}
}
public class InterfaceUpCastDemo {

	public static void main(String[] args) {
		Shape shape = new Circle();
		// TODO Auto-generated method stub
		Drawing dr = new Drawing();
		dr.drawShapes(new Circle());
		System.out.println("**********************");
		dr.drawShapes(new Square());
		

	}

}
