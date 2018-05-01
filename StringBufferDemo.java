
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		synchronized(sb) {
			sb.append("fhdjks");
			sb.delete(2, 3);
		}
		sb.append("fdsfds");
		//StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.ensureCapacity(1000);
		sb.append("How are You I am Fine....nghfdjkhgdhkjghjkhghdghdjkghkjdhgkhdhgdkhfghkfjd");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.deleteCharAt(0);
		sb.delete(2, 5);  // index, pos
		sb.insert(2, "Hello");
		sb.reverse();
		System.out.println(Thread.currentThread());
	}

}
