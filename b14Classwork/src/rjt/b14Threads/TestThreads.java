package rjt.b14Threads;

public class TestThreads {
	
	public static void main(String[] args)
	{
		//myThread myThread = new MyThread(0; 
		//myThread.start(); 
		//ThreadInterface mti = new ThreadInterface();
		//Thread t0 = new Thread(mti);
		//t1.start(); 
		
		/*Dog t1 = new Dog("Dog: ");		
		Cat t2 = new Cat("Cat: ");
		
		t1.start();
		t2.start();*/
		
		MyThread t1 = new MyThread("A:  ");
		MyThread t2 = new MyThread("B:  ");
		MyThread t3 = new MyThread("C:  ");
		
		t1.start();
		
		
		try {
			t1.join(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
		
		
	}

}
