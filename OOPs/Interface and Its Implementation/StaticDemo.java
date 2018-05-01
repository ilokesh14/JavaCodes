import static java.lang.System.out;
import static java.lang.Math.abs;
//import java.lang.*;



//class Student{
//	Course course = new Course();
//}
//class Course{
//	
//}

class A
{
	  static class B{
		
	}
}

//final class MathOpr{
//	private MathOpr() {}
interface MathOpr{
	static void sqrt() {
		out.println("sqrt");
	}
	static void power(){
		out.println("Power");
	}
	
}

interface T{
	default void show() {
		out.println("this is t show...");
	}
	static void display() {
		out.println("this is t display");
	}
}
class T2 implements T{
	
}
public class StaticDemo {

	public static void main(String[] args) {
		abs(-99);
		T.display();
		T2 obj = new T2();
		obj.show();
		//T.show();
		//MathOpr opr = new MathOpr();
		//opr.power();
		MathOpr.power();
		// TODO Auto-generated method stub
		Student ram = new Student(1001,"Ram");
		Student shyam =new Student(1002,"Shyam");
		out.println(Student.noOfStudents);
		//ram = null;
		out.println("After Null "+Student.noOfStudents);
		out.println(ram.rollno);
		
	}

}

class Student{
	int rollno;
	String name;
	static int noOfStudents;
	Student(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
		System.out.println("Student Cons Call "+this.rollno + " "+this.name);
		noOfStudents++;
	}
}

