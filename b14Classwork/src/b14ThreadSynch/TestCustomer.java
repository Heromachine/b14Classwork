package b14ThreadSynch;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer(); 
		
		new Thread() {
			@Override
			public void run()
			{
				c1.witdraw(1500);
			}
		}.start();
		
		new Thread() {
			@Override
			public void run()
			{
				c1.deposit(1000);
			}
		}.start();

	}

}
