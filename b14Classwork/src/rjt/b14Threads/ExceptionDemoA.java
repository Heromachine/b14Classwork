package rjt.b14Threads;

public class ExceptionDemoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		
		m();

	}
	
	public static void m() {
		try {
			n();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("Exception in m");
		}
	}
	public static void n() {o();}
	public static void o() {int a = 1/0;}

}
