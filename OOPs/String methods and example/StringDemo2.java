class StringDemo2{
public static void main(String args[]){
StringBuilder sb = new StringBuilder("Hello");
//StringBuffer sb = new StringBuffer("Hello");
System.out.println(sb.length());
System.out.println(sb.capacity());
sb.append("How are You I am Fine.....");
System.out.println(sb.length());
System.out.println(sb.capacity());


}
}