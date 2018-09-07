package UserName;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.Validator;

public class TestUsernameVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UsernameValidator validator = new UsernameValidator();
		System.out.print(validator.validate1("I study English"));
		
		//System.out.println("I study English".matches("I study \\+"));
	}

}
