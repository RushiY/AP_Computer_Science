package review;
import java.util.Scanner;

class Utility {

	private Utility() {

	}

	private static Scanner keyboard = new Scanner(System.in);

	/**
	 * This method prompts a user to enter an integer value from the keyboard. It
	 * then reads and returns the integer value using the Scanner class's nextInt
	 * method.
	 * 
	 * @param prompt the user prompt
	 * @return the value read from keyboard
	 */
	public static int readInt(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt); // user prompt
		int num = scan.nextInt();
		return num;
	}

	/**
	 * This method prompts a user to enter a double value from the keyboard. It then
	 * reads and returns the double value using the Scanner class's nextDouble
	 * method.
	 * 
	 * @param prompt the user prompt
	 * @return the value read from keyboard
	 */
	public static double readDouble(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt); // user prompt
		double num = scan.nextDouble();
		return num;
	}

	/**
	 * This method prompts a user to enter a string from the keyboard. It then reads
	 * and returns the string using the Scanner class's nextLine method.
	 * 
	 * @param prompt the user prompt
	 * @return the value read from keyboard
	 */
	public static String readString(String prompt) {
		Scanner scan = new Scanner(System.in);
		System.out.print(prompt); // user prompt
		String str = scan.nextLine();
		return str;
	}

	/**
	 * This method prints blank lines on the console window.
	 * 
	 * @param num the number of lines to display
	 */
	public static void blankLines(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println();
		}
	}
}

public class UtilityTester {
	public static void main(String[] args) {
		int iNum = Utility.readInt("Enter an integer -->");
		System.out.println("The number = " + iNum);

		Utility.blankLines(2);

		double dNum = Utility.readDouble("Enter a double -->");
		System.out.println("The number = " + dNum);

		Utility.blankLines(2);

		String str = Utility.readString("Enter a string -->");
		System.out.println("The string = " + str);

		Utility.blankLines(2);
	}
}