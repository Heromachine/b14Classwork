package rjt.b14Threads;

public class WorkerThread implements Runnable{
	
	private String message;
	
	public WorkerThread(String msg)
	{
		message = msg;
	}
	
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ " \tStart Message = "+ message);
		processing();
		System.out.println(Thread.currentThread().getName()+ " [Complete]");
	}
	private void processing()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
 
