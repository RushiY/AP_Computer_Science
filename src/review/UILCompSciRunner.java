package review;
import java.util.Scanner;

public class UILCompSciRunner {

	public static void main(String[] args) {
		UILCompSci n = new UILCompSci();
		UILCompSci.inputs();
		UILCompSci.score();

		System.out.println();

		System.out.println(n); //print only the obj not the method

	}

}

class UILCompSci {
	private static int correct;
	private static int incorrect;
	private static int score;
	private static String name;
	private static Scanner key = new Scanner(System.in);

	public UILCompSci() {
		correct = 0;
		incorrect = 0;
		score = 0;
		name = "";
	}

	public static void inputs() {
		name = Utility.readString("Enter contestant's name --> ");
		correct = Utility.readInt("Enter correct --> ");
		incorrect = Utility.readInt("Enter incorrect --> ");

	}

	public static int getSkipped() {
		return 40 - (correct + incorrect);
	}

	public static String getName() {
		return name;
	}

	public static int getCorrect() {
		return correct;
	}

	public static int getIncorrect() {
		return incorrect;
	}

	public static void score() {
		score += correct * 6;
		score -= incorrect * 2;
	}

	public static int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Contestant's Name : " + UILCompSci.getName() + "\nCorrect           : " + UILCompSci.getCorrect()
				+ "\nIncorrect         : " + UILCompSci.getIncorrect() + "\nSkips             : "
				+ UILCompSci.getSkipped() + "\n------------------------------" + "\nScore             : "
				+ UILCompSci.getScore();

	}
}