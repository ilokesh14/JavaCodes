
public class Loops {

	public static void main(String[] args) {
		myloop:
		for(int i = 1; i<=3; i++) {
			for(int j= 1; j<=3; j++) {
				if(i==j) {
					continue myloop;
				}
				System.out.println("I is "+i+" and J is "+j);
			}
		}

	}

}
