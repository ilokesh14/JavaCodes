import java.text.SimpleDateFormat;
import java.util.Random;

 class ThreadLocalExample implements Runnable{

   
    private static final ThreadLocal<Integer> local = new ThreadLocal<>(){
        @Override
        protected Integer initialValue()
        {
            return new Random().nextInt(100);
        }
    };
    

@Override
public void run() {
    System.out.println("Thread Name= "+Thread.currentThread().getName()+" Default Value is "+local.get());
    try {
        Thread.sleep(100);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    //formatter pattern is changed here by thread, but it won't reflect to other threads
    Integer ww = local.get();
    ww++;
    local.set(ww);
    
    System.out.println("After Set Thread Name= "+Thread.currentThread().getName()+" Value = "+local.get());
}
}
public class ThreadLocalDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadLocalExample obj = new ThreadLocalExample();
        for(int i=0 ; i<3; i++){
            Thread t = new Thread(obj, ""+i);
            Thread.sleep(50);
            t.start();
        }
	}

}
