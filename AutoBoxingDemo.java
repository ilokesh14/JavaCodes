import java.util.LinkedList;

public class AutoBoxingDemo {

	public static void main(String[] args) {
		//System.out.println((2.0f-1.8f));
		/*This is autoboxing demo,autoboxing basically means coverting primitive data tyoes to objects ...   */

		int m = 100; //int is a primitive datatype .
		Integer gg = m;  //Integer is not a primitive data type but it is wrapper class,before java 1.5 this line was illagal .
		gg++; 
		int p = 100;
		Integer d = new Integer(p); //An object is created of Integer type and refrence of type int (p) is stored in d .
		

		//in java linked list can directly be used as shown :
		
		LinkedList l = new LinkedList(); //create object of linked list 
		l.add(d);                        //add element to linked list as d which contains the reference .
		l.add(new Integer(200));         //to get the first node value we use l.get(0) method and to typecaste the value it requires(Integer)
		Integer b = (Integer)l.get(0) ; 
		int c = b.intValue();
		c++;
		b = new Integer(c);
		l.add(0, new Integer(c));
		System.out.println(l);
		


		int x =100;
		Integer y = new Integer(127);
		int y1 = y.intValue();
		y1++;
		Integer y2 = 127;
		Integer v3 = Integer.valueOf(100);
		System.out.println(y==y2);
		//Integer z = new Integer(100);
		String v = "Hello";
		String v1 = new String("Hello");

	}

}
