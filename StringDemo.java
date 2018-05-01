class StringDemo{
public static void main(String ...a){
StringBuilder sb = new StringBuilder();  
synchronized(sb){
sb.append("hello");
//sb.insert(1,"Hello");
System.out.println(sb);
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.append("How are You I am Fine");
System.out.println(sb.capacity());
System.out.println(sb.length());
}
// Old Capacity * 2 + 2 =New Capacity

}
}