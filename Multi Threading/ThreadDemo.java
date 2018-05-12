class FileCopy{
	void logic() {
		for(int i = 1; i<=5; i++) {
			System.out.println("File Copy Start "+i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Job implements Runnable {
	FileCopy fp = new FileCopy();
	@Override
	public void run() {
		fp.logic();
		// File Copy Logic
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Job job = new Job();
		Thread worker = new Thread(job,"ram");
		 // call run()
		Job job2 = new Job();
		Thread worker2 = new Thread(job2,"shyam");
		worker.start(); 
		worker2.start();
		for(int i = 1;i<=5; i++) {
			System.out.println(" i am main "+Thread.currentThread().getName()+" "+i); 
			
		}
		

	}

}
