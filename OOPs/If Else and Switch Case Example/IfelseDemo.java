class IfelseDemo{
public static void main(String ...arr){
int a =1;
boolean x = false;
if(x=true){
	System.out.println("True ");
}
else{
System.out.println("False ");
}
// From Java 7 switch case can have String
//final int SUNDAY = 1;
//final int MONDAY = 2;
//int day = SUNDAY;
String day = "Sunday";
switch(day){
default:
	System.out.println("Wrong Day");
	break;
case "Sunday":
	System.out.println("Sunday ");
	break;
case "Monday":
	System.out.println("Monday ");
	break;
	
}
}
}