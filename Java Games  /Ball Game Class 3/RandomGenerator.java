import java.util.Random;

public class RandomGenerator {
	int seed;
	Random r ;
	public RandomGenerator(int seed) {
	 this.seed = seed;		
	 r= new Random(this.seed);
	}
	
	public int getRandom() {
		int num = r.nextInt(this.seed);
		return num==0?10:num;
	}
	
	
}
