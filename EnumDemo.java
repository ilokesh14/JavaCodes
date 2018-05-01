interface GameConstants{
	int HEIGHT=900;
	int WIDTH=1000;
	int SUNDAY = 1;
	int MONDAY = 2;
	
}
enum Weeks {
	SUNDAY(1), MONDAY(2);
	private int value;
	 Weeks(int value) {
		System.out.println("Cons Call "+value);
		 this.value = value;
	}
	 public int getValue() {
		 return this.value;
	 }
	
		
		
};

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Weeks  w = Weeks.MONDAY;
//		int day = 1;
//		System.out.println(w.getValue());
//		Weeks day = Weeks.SUNDAY;
//		switch(day) {
//		case SUNDAY:  // SUNDAY
//			System.out.println("JUST CHILL DAY");
//			break;
//		case MONDAY:
//			System.out.println("WORK WORK...");
//			break;
//		}
		Weeks w1 = Weeks.MONDAY;
		System.out.println(w1.getValue()==2);
		System.out.println(w1);
//		String day = "SUNDAY";
//		switch(day) {
//		case "SUNDAY":
//			System.out.println("JUST CHILL DAY");
//			break;
//		case "MONDAY":
//			System.out.println("");
//		}

	}

}
