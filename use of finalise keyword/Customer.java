import java.util.ArrayList;

class CashCustomer {
	int id;
	String name;
	double balance;
	static CashCustomer e;
	CashCustomer(int id, String name, double balance){
		this.id = id ;
		this.name  = name;
		this.balance = balance;
	}
	@Override
	protected void finalize() {
		e = this;
		System.out.println(e + " "+this);
		System.out.println("E is "+e.id+" "+e.name+" "+e.balance);
		System.out.println("Bye Bye..."+this.id +" "+name +" "+balance);
	}
}
public class Customer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CashCustomer cobject = new CashCustomer(1001,"Ram",9999);
		System.out.println(cobject);
		cobject= null;
		
		System.gc(); 
		for(int i = 1; i<=10; i++) {
			System.out.println("I is "+i);
		}
		if(CashCustomer.e!=null) {
		cobject = CashCustomer.e;
		System.out.println("REBORN "+cobject.id);
		}
		
//		ArrayList l = new ArrayList();
//		long w = 1;
//		System.out.println("Code Start...");
//		while(true) {
//			CashCustomer customer =new CashCustomer(1001,"Ram"+w,999);
//			w++;
//			l.add(customer);
//			Thread.sleep(50);
//			//System.out.println("Object Created ");
		//}
	}

}






