package review;
import java.util.*;

class Dance {

	// Constants

	public final int GoldPass = 1;
	public final int SilverPass = 2;
	public final int BronzePass = 3;
	public final int NoPass = 4;

	// Instance Variables

	private int attendance;
	private double ticketSales;

	// Constructors

	public Dance() {
		attendance = 0;
		ticketSales = 0.0;
	}

	// Methods

	/**
	 * precondition: value of code is in the range (1 to 4) inclusive.
	 * postcondition: updates the ticketSales by the price of the ticket specified
	 * by the parameter code. The attendance variable is incremented by one.
	 * 
	 * @param code a value from (1 - 4) indicating the type of ticket
	 */

	public void buyTicket(int code) {
		boolean flag = false;
		while (flag == false) {
			Scanner key = new Scanner(System.in);
			System.out.println("===================\n" + "     Buy Ticket\n" + "===================\n"
					+ "1. Gold Pass\n" + "2. Silver Pass\n" + "3. Bronze Pass\n" + "4. No Pass");
			System.out.print("Selection --> ");
			code = key.nextInt();
			if (code == 1) {
				System.out.println("In Case 1");
				attendance++;
				flag = true;
			} else if (code == 2) {
				System.out.println("In Case 2");
				ticketSales += 2.0;
				attendance++;
				flag = true;
			} else if (code == 3) {
				System.out.println("In Case 3");
				ticketSales += 4.0;
				attendance++;
				flag = true;
			} else if (code == 4) {
				System.out.println("In Case 4");
				ticketSales += 6.0;
				attendance++;
				flag = true;
			} else {
				System.out.print("Selection --> ");
				code = key.nextInt();
			}
		}
	}

	/**
	 * @return the value of attendance
	 */

	public int getAttendance() {
		return attendance;
	}

	/**
	 * @return the amount of ticketSales
	 */

	public double getTicketSales() {
		return ticketSales;
	}

}

public class StudentCouncil {

	// Instance Variables

	private Dance dance;
	private Scanner scan;

	// Constructor

	public StudentCouncil() {
		dance = new Dance();
		scan = new Scanner(System.in);
	}

	// Methods

	public void mainMenu() {
		int ans = 0;
		do {
			System.out.println("======================");
			System.out.println("        Main Menu");
			System.out.println("======================");
			System.out.println("1. Buy a Ticket");
			System.out.println("2. Print Summary Report");
			System.out.println("3. Exit");
			System.out.println();
			System.out.print("Selection --> ");
			ans = scan.nextInt();
			System.out.println();
			if (ans == 1) {
				buyTicket();
			} else if (ans == 2) {
				printSummary();
			}
		} while (ans != 3);
	}

	/**
	 * precondition: none postcondition: prints a menu of ticket options and allows
	 * the user to select one of the items in the menu. It purchases a ticket
	 * according to ticket type selected.
	 */

	public void buyTicket() {
		dance.buyTicket(0);
	}

	/**
	 * precondition: none postcondition: prints a summary report that includes the
	 * current number of students attending the dance and the current amount of
	 * money made from ticket sales.
	 */

	public void printSummary() {
		System.out.println("===========================\n" + "        Summary Report\n"
				+ "===========================\n" + "Total Attendance =   " + dance.getAttendance() + "\n"
				+ "Ticket Sales     = $" + dance.getTicketSales() + "\n" + "");
	}

	public static void main(String[] args) {
		StudentCouncil app = new StudentCouncil();
		app.mainMenu();
	}
}
