package rjt.b14Threads;

public class Cat extends Thread {
	public Cat(String string)
	{
		super(string);
	}
	@Override
	public void run() 
	{
		super.run();
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(Thread.currentThread().getName()+i); 
		}	
	}
}
