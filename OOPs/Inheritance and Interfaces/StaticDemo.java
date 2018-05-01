class MathOpr{
	static void sqrt() {
		
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
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student(1001,"Ram");
		Student shyam =new Student(1002,"Shyam");
		System.out.println(Student.noOfStudents);
		ram = null;
		System.out.println("After Null "+Student.noOfStudents);
		System.out.println(ram.rollno);
		
	}

}	
