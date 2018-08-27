package rjt.b14Threads;

public class TestThreads {
	
	public static void main(String[] args)
	{
		//myThread myThread = new MyThread(0; 
		//myThread.start(); 
		//ThreadInterface mti = new ThreadInterface();
		//Thread t0 = new Thread(mti);
		//t1.start(); 
		
		Dog t1 = new Dog("Dog: ");		
		Cat t2 = new Cat("Cat: ");
		
		t1.start();
		t2.start();
		
		
	}

}
