package review;
import java.util.Scanner;

public class MethodPractice2 {

	private Scanner scan = new Scanner(System.in);

	// Implement methods below this line

	public static void main(String[] args) {
		MethodPractice2 app = new MethodPractice2();
		System.out.println("******************");
		System.out.println("   Test greeting");
		System.out.println("******************");
		app.greeting("Kendall", 6);
		System.out.println("\n\n******************");
		System.out.println(" Test range");
		System.out.println("******************");
		app.range(10, 15);
		System.out.println("\n\n******************");
		System.out.println(" Test compare");
		System.out.println("******************");
		System.out.println(app.compare("demand"));
		System.out.println(app.compare("football"));
		System.out.println(app.compare("bulb"));
		System.out.println("\n\n******************");
		System.out.println(" Test reverse");
		System.out.println("******************");
		System.out.println(app.reverse("ball"));
		System.out.println(app.reverse("courage"));
		System.out.println(app.reverse("hamburger"));
		System.out.println("\n\n******************");
		System.out.println(" Test numOccurrences");
		System.out.println("******************");
		System.out.println(app.numOccurrences("MISSISSIPPI", "I"));
		System.out.println(app.numOccurrences("AUTOMOBILE", "O"));
		System.out.println(app.numOccurrences("TEXAS", "R"));
		System.out.println();
	}

	public void greeting(String name, int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(name + ", have a nice day.");
		}
	}

	public void range(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}

	public boolean compare(String str) {
		if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))) {
			return true;
		}
		return false;
	}

	public String reverse(String str) {
		String dummy = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			dummy += str.substring(i, i + 1);
		}
		return dummy;
	}

	public int numOccurrences(String str, String letter) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(letter)) {
				count++;
			}
		}
		return count;
	}
}
