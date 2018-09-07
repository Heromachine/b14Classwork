package b14ThreadSynch;

public class MyThread extends Thread{
	
	Table table; 
	int num; 
	
	public MyThread(Table t, int no)
	{
		table = t;
		num = no; 
	}
	
	@Override
	public void run()
	{
		table.PrintTable(num); 
	}
	
	
	
}
