package b14ThreadSynch;

public class TestSynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table table = new Table();
		MyThread mt1 = new MyThread(table, 2);
		MyThread mt2 = new MyThread(table, 15);
		MyThread mt3 = new MyThread(table, 100);
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		
	}

}
