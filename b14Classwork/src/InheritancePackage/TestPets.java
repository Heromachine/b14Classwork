package InheritancePackage;

public class TestPets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat mittens = new Cat();
		Cat.Baby kitten = mittens.new Baby(); 
	
	
		Kitten.speak("meow");
	}

}
