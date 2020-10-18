package arrays;
public class Dog {
	// instance variables
	private String name;
	private String breed;
	// constructors

	public Dog() {
		name = "";
		breed = "";
	}

	public Dog(String n, String b) {
		name = n;
		breed = b;
	}

	// accessor methods
	public void setName(String n) {
		name = n;
	}

	public void setBreed(String b) {
		breed = b;
	}

	// mutator methods
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}
}