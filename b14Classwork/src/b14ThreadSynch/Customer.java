package b14ThreadSynch;

public class Customer {
	
	int amount = 1000; 
	
	synchronized public void deposit(int amt) {
		System.out.println("goint to depost");
		this. amount += amt; 
		notify(); 
		
		
	}
	synchronized public void witdraw(int amt)  
	{
		amount  -= amt; 
		if (amount< amt)
		{
			try {
				System.out.println("Not Enogh Money");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
