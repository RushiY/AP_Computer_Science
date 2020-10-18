package arrays;
import java.util.*;

public class Kennel {
	// instance variable
	private Dog[] dogs; // declare array variable

	// constructor
	public Kennel() {
		dogs = new Dog[5]; // instantiate array with length 5
	}

	/*
	 * This method allows a user input information about 5 dogs and stores this
	 * information in the array dogs.
	 */
	public void addDogs() {
		System.out.println("************************");
		System.out.println("*       addDogs        *");
		System.out.println("************************");

		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Enter dog name --> ");
			String name = keyboard.nextLine();
			System.out.print("Enter dog breed --> ");
			String breed = keyboard.nextLine();

			dogs[i] = new Dog(name, breed);
			System.out.println();
		}
	}

	/*
	 * This method displays the name and breed for each Dog in the array.
	 */
	public void printDogs() {
		System.out.println("************************");
		System.out.println("*      printDogs       *");
		System.out.println("************************");
		for (int i = 0; i < 4; i++) {
			System.out.println("Dog name = " + dogs[i].getName());
			System.out.println("Dog breed = " + dogs[i].getName());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Kennel app = new Kennel();
		app.addDogs();
		app.printDogs();
	}
}