package arrays;
import java.util.Scanner;

public class BirthdayManager {
	private Birthday a;
	private Birthday[] birthday;
	private String output;

	public BirthdayManager() {
		birthday = new Birthday[50];
		output = "";
	}

	public void input() {
		Scanner key = new Scanner(System.in);

		for (int i = 0; i < birthday.length; i++) {
			a = new Birthday();
			System.out.print("Enter name --> ");
			a.setName(key.nextLine());
			System.out.print("Enter Bday --> ");
			a.setBday(key.nextLine());
			output += "Enter name = " + a.getName() + "\nEnter Bday = " + a.getBday() + "\n";

			System.out.print("Enter another student[y/n]? ");
			String temp = key.nextLine();
			if (temp.equalsIgnoreCase("y")) {

			} else {
				break;
			}

		}
	}

	@Override
	public String toString() {
		return output;
	}

	public static void main(String[] args) {
		BirthdayManager app = new BirthdayManager();
		System.out.println("************************");
		System.out.println("*     addBirthdays     *");
		System.out.println("************************");

		app.input();

		System.out.println("************************");
		System.out.println("*    printBirthdays    *");
		System.out.println("************************");
		System.out.println(app);
	}
}