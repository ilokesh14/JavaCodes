class Flow
{
	void db() throws ArithmeticException{
		try {
		System.out.println("DB Connection Build....");
		System.out.println("DO Query to the DB");
		int e = 100/0;  // throw new ArithmeticException()
		if(10>2) {
			//System.exit(0);
			//return ;
		}
		System.out.println("Give Result");
		}
		finally {
		System.out.println("Connection Close");
		}
	}
	void logic() throws ArithmeticException{
		System.out.println("Call DB");
		db();
		
		System.out.println("Collect Data from DB");
		System.out.println("DO Processing on Data");
		System.out.println("Send result to the View");
	}
	void view() {
		System.out.println("Cqll logic");
		try {
		logic();
		System.out.println("Get result from the logic");
		System.out.println("Print Result");
		}
		catch(ArithmeticException e) {
			System.out.println("can't print the result "
					+ "because DB is Down...."+e);
			e.printStackTrace();
		}
		}
}
public class ProgramFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flow flow = new Flow();
		flow.view();
	}

}
