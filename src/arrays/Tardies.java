package arrays;
import java.util.*;

public class Tardies {
// instance variables
	private Student[] students; // list of students
	private int numStudents; // logical size of the array
	private static int tardies;
	private String output;
	private Student a;

// constructor
	public Tardies() {
		students = new Student[50]; // instantiate array
		numStudents = 0;
		tardies = 0;
		output = "";
	}

	/**
	 * precondition: none postcondition: students array has been populated with
	 * Student objects from keyboard input. numStudents has been updated to reflect
	 * the logical size of the array student.
	 */
	public void enterData() {
		Scanner key = new Scanner(System.in);

		for (int i = 0; i < students.length; i++) {
			a = new Student();
			System.out.print("Enter last name --> ");
			a.setLastName(key.nextLine());
			System.out.print("Enter first name --> ");
			a.setFirstName(key.nextLine());
			System.out.print("Enter number of tardies --> ");
			int total = key.nextInt();
			a.setTardies(total);
			tardies += total;
			output += a.getLastName() + ", " + a.getFirstName() + " " + a.getTardies() + "\n";

			key.nextLine();

			System.out.print("Enter another student[y/n]? ");
			String temp = key.nextLine();
			if (temp.equalsIgnoreCase("y")) {

			} else {
				break;
			}

		}
	}

	/*
	 * @return the total number of tardies for all students in the class.
	 */
	public static int getTotalTardies() {
		return tardies;
	}

	/**
	 * precondition: none postcondition: a summary report has been returned from the
	 * toString which includes the total number of tardies for the entire class and
	 * a list of names and tardies for every student in the class.
	 */
	public String toString() {
		String real = "==================================" + "\nClass Summary - Tardy Total = " + getTotalTardies()
				+ "\n==================================\n";
		real += output;
		return real;
	}

	public static void main(String[] args) {
		Tardies app = new Tardies();
		app.enterData();
		System.out.println(app);
	}
}