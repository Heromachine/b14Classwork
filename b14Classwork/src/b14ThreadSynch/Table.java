package b14ThreadSynch;
/**
 * This class is a shared data class 
 * @author herotruth
 *
 */
public class Table {
	/**
	 * This method will print a table
	 * 
	 */
	 void PrintTable (int no)
	{
		System.out.println(Thread.currentThread().getName() + ": ");
		
		synchronized (this)
		{
			for(int i = 1; i < 5; i++) 
			{
				System.out.println(no*i+"\n");
				try {
					Thread.sleep(700);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

}
