package b14ThreadSynch;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bankAccount = new BankAccount();
		Thread withdrawThread = new Thread() {
			@Override
			public void run() {
				bankAccount.witdraw(2000);
			}
			
		};
		
		withdrawThread.start();
		
		Thread depoThread = new Thread();
				

	}

}
