package UserName;

import java.util.regex.Pattern;

public class C_ValidateANDMatch_SSN 
{
	boolean match = false;

	private Pattern pattern; 
	private static final String SSN_PATTERN = "^(\\d{3}-?\\d{2}-?\\d{4})$";
	
	public C_ValidateANDMatch_SSN(String sSSN)
	{
		pattern = Pattern.compile(SSN_PATTERN);
		
		match = pattern.matcher(sSSN).matches();
		
	}
	
	public boolean isMatch() {
		return match;
	}
	
}
