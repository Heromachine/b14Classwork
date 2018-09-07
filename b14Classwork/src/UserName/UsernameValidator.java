package UserName;

import java.util.regex.Pattern;

import org.omg.CORBA.PUBLIC_MEMBER;

public class UsernameValidator {	

	private Pattern pattern; 
	private Pattern pattern2; 	
	
	private static final String USERNAME_PATTERN = "^[ A-Za-z0-9._-]{3,15}$";
	private static final String MYPATTERN = "I study [\\w+\\s]{1,}";
	
	public UsernameValidator() {
		super();
		pattern = Pattern.compile(USERNAME_PATTERN);
		pattern2 = Pattern.compile(MYPATTERN);
		// TODO Auto-generated constructor stub
		
	}
	
	public boolean validate(final String text)
	{
		return pattern.matcher(text).matches();
	}
	
	public boolean validate1(final String text)
	{
		return pattern2.matcher(text).matches();
	}
	
	
	
	

}
