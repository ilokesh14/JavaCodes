class DataTypes{
public static strictfp void main(String ...args){
Integer e1 = 200;
Integer e2 = 200;
Integer e3 = new Integer(900);
Long rr = 10;
System.out.println(e1==e2?"In Integer Pool ":"Not In integer pool");
String name = "Amit".intern();
String name2 = "Amit".intern();
String name3 = new String("Amit").intern();
if(name == name3){
System.out.println("Same Ref ");
}
else{
System.out.println("Not Same Ref ");
}

name  = "Ram";  // Immutable
System.out.println(name==name3?"Same Ref ":"Not Same Ref ");


//byte a = (byte)129;
byte a = 110;
byte b = 120;
byte c = (byte)(a + b);
a+=b; // a = a + b
System.out.println("Sum is "+a);
short w = 30000;
int r = 200000;
long t = 2100000l;
System.out.println(t);

float e = 10.20f;
System.out.println(e);
double y1 = 10.4353712;

char v = 'ए';
System.out.println(v);
String message = "नमस्ते आप कैसे हैं";
System.out.println(message); 

boolean r1 = true;
/*while(true){

}*/


}
}