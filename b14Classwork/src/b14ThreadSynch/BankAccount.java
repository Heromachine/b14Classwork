package b14ThreadSynch;

public class BankAccount {

	int amount = 1000;
	
	synchronized public void deposit (int x)
	{
		amount = x; 
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
		System.out.println("CurrentB Balance = : "+ amount);
		amount -= x; 
	}

}
