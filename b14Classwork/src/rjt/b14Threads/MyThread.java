package rjt.b14Threads;

public class MyThread extends Thread
{
	public MyThread(String string)
	{
		super(string);
	}
	@Override
	public void run() 
	{
		super.run();
		
		for (int i = 0; i < 5; i++)
		{
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+i); 
		}		
	}
}
