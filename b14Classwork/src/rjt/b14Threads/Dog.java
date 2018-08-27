package rjt.b14Threads;

public class Dog extends Thread {
	
	public Dog(String string)
	{
		super(string);
	}
	
	@Override
	public void run() 
	{
		super.run();
		
		for (int i = 0; i < 100; i++)
		{
			System.out.println(Thread.currentThread().getName()+i); 
		}
	}
}
