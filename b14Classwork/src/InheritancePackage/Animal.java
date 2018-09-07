package InheritancePackage;

public class Animal {
	
	int size;
	int age;
	String Breed; 
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Animal(int size, int age, String breed) {
		super();
		this.size = size;
		this.age = age;
		Breed = breed;
	}

	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	
	public void speak (String s)
	{
		System.out.println(s);
	}

	
	
	

}
