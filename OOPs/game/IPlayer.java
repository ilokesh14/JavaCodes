//public abstract interface IPlayer
public interface IPlayer {
void jump(int power);  // public abstract void jump(int power)
public abstract void run();
int MAX_SPEED = 100; // public static final int MAX_SPEED = 100;

public default void attack(){
	System.out.println("Attack ....");
}



}
interface IStarPlayer{
	void extraPowers();
	int MAX_SPEED = 100; 
	public abstract void run();
	public default void attack(){
		System.out.println("Attack2 ....");
	}

}
interface IComboPlayer extends IPlayer,IStarPlayer{
	public default void attack(){
		IPlayer.super.attack();
		IStarPlayer.super.attack();
		System.out.println("Attack3");
	}
}
class King implements IComboPlayer{
	@Override
	public void jump(int power){
		System.out.println("king jump");
		
	}
	@Override
	public void run(){
		System.out.println(IPlayer.MAX_SPEED + IStarPlayer.MAX_SPEED);
	}
	@Override
	public void extraPowers() {
		// TODO Auto-generated method stub
		
	}
}
class Bot implements IPlayer{

	@Override
	public void jump(int power) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
