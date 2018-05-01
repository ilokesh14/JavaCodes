interface Card{
	public static final int X = 10;
	public abstract void emi();
	void roi();
//	void points();
//	void discounts();
	public default void memberShip() {
		System.out.println("CardAll Has MemberShip..");
	}
}
interface Insurance{
	int X = 20;
	void due();
	void roi();
	public default void memberShip() {
		System.out.println("Insurance All Has MemberShip..");
	}
}
interface ValueAddition extends Card, Insurance{
	@Override
	public default void memberShip() {
		Card.super.memberShip();
		Insurance.super.memberShip();
	}
}
class SilverCard implements Card{
	@Override
	public void emi() {
	System.out.println("Emi for 60 Days...");	
	}

	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}
}
class GoldCard implements ValueAddition{
	public void emi() {
		System.out.println("Emi for 90 Days..."+Card.X +  Insurance.X);	
		}
	public void due() {
		
	}
	@Override
	public void roi() {
		// TODO Auto-generated method stub
		
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
