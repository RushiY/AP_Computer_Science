package arraylists;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneList {
	private ArrayList<Contact> phoneList = new ArrayList<Contact>();
	private Scanner key = new Scanner(System.in);
	private int counter;

	public void getContactInfo() {
		String flag = "";
		counter = 0;
		do {
			System.out.print("Enter name --> ");
			String name = key.nextLine();
			System.out.print("Enter phone number --> ");
			String number = key.nextLine();

			phoneList.add(new Contact(name, number));
			counter++;

			System.out.println();

			System.out.print("Continue [Y or N]? ");
			flag = key.nextLine();
			System.out.println();
		} while (!flag.equalsIgnoreCase("N"));
	}

	public void printContactInfo() {
		System.out.println("       Contact List\n-----------------------------");
		
		for(Contact temp : phoneList) {
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		PhoneList app = new PhoneList();
		app.getContactInfo();
		app.printContactInfo();
	}
}