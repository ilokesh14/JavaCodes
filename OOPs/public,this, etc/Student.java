/**
 * This class is a Student class contains student specific operations
 * and data
 * @author amit
 * @since 27-Dec-2017
 * @see Person
 * @version 1.0
 */
public class Student {
	/*
	 * 
	 */
	/**
	 * id field contain the Student unique number
	 */
	
	// default scope 
	private int id;  //Member Variables 
	/**
	 * this field contains the name of a student
	 */
	private String name;
	private String course;
	private String collegeName;
	
//	// Default
	Student(){
		collegeName = "SRCC";
		//this.id = 1001;
	}
//	// Param
	Student(int id , String name ,String course){
		//Student();
		this();  // Default Cons Call 
		this.id = id;
		this.name = name;
		this.course  = course;
	}
	
	public void takeInput(int id , String name, String course) {
		if(!(id>1000)) {
			System.out.println("Id Can't be negative... Invalid ");
			return ;
		}
		this.id = id;  // Member Variable = Local Variable
		this.name = name;
		this.course = course;
	}
	
	/**
	 * 
	 */
	public void print() {  //ref is get copy and store in special 
		// keyword called this
		System.out.println("Id is "+this.id); //99.id
		System.out.println("Name is "+name);
		System.out.println("Course is "+course);
		System.out.println("College Name is "+collegeName);
	}
	
	
}
