
public class DemoA {

	public static void main(String[] args) {
		String test = "Hello";
		System.out.println(test==test.toUpperCase());
		test.toLowerCase();
		boolean result= test.contains("el");
		byte e [] = test.getBytes();
		char ee[] = test.toCharArray();
		int index = test.indexOf("l");
		index = test.lastIndexOf("l");
		result = test.isEmpty();
		int len = test.length();
		test = test.replace('l', 'w');
		String arr [] = "A-10, Roop Nagar, Delhi-7".split(",");
		String subString = test.substring(2,4); // index, position
		test = "    Hello     How    ".trim();
		
		
		result = test.endsWith("lo");
		result= test.startsWith("He");
		test = test+"Hi"+"How";
		//test.concat("Hi").concat("How");
		char t = test.charAt(0); //test[i]
		String temp = String.valueOf(t);
		System.out.println("AMIT".compareToIgnoreCase("Amit"));
		String name = new String("Amit");  // 2 or 1
		String name2 = "Amit".intern();  // 1 or 0
		if(name.equals(name2)) {
			System.out.println("Value are same");
		}
		else {
			System.out.println("Value are not same");
		}
		//name = name +" Srivastava ";
		if(name==name2) {
			System.out.println("Same Ref");
		}
		else {
			System.out.println("Not Same Ref");
		}

	}

}
