class StringDemo{
public static void main(String args[]){
String a= "Hello".intern();  // 1 or 0 
String b = "Hello";
//String c = new String("Hello").intern();  // 2 or 1

if(a==b){
System.out.println("Same Ref ");
}
else{
System.out.println("Not Same Ref ");
}
a="ok";
if(a==b){
System.out.println("Same Ref ");
}
else{
System.out.println("Not Same Ref ");
}
a="HELLO";
if(a.equalsIgnoreCase(b)){
	System.out.println("Same Value ");
}
else{
	System.out.println("Not Same Value ");
}
}
}