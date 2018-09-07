package ExceptionsPKG;

public class CustomException extends Exception{
	
	public CustomException()
	{
		super("Throw Exception");
	}
	
	public static void main(String[] args)
	{
		try { 
		
			throw new CustomException();
			
		}catch(CustomException ex) {
			System.out.println("exception catch");
		}
		
	}
}
