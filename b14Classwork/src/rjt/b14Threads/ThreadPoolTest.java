package rjt.b14Threads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService exService = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < 10;i++)
		{
			Runnable worker = new WorkerThread(""+ i);
			exService.execute(worker);
		}
		
		exService.shutdown();
		System.out.println("=======FINISHED========");
	}
	
}
