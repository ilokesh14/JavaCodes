class StringBufferDemo{

public static void main(String args[]){
show();
StringBuilder sb = new StringBuilder(2000);
// 4 Chars + 16 Chars
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.append(" Srivastava StringBuffer Demo Example");
System.out.println(sb.capacity());
System.out.println(sb.length());

}
}