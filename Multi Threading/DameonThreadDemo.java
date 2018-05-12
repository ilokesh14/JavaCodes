class DThread implements Runnable{
	public void run() {
		while(true) {
            doSomeThing();
        }
	}
	void doSomeThing() {
		System.out.println("I am Done....");
	}
}



public class DameonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new DThread());
		t1.setDaemon(true);
		
		t1.start();
		
		

	}

}
