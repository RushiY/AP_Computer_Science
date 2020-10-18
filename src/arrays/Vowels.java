package arrays;
import java.util.Scanner;

public class Vowels {
	private String[] array = new String[10];
	private Scanner scan = new Scanner(System.in);
	private int counter;

	public static void main(String[] args) {
		Vowels v = new Vowels();

		v.ask();
		v.find();
		System.out.println(v);

	}

	public void ask() {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Word " + (i + 1) + " --> ");
			array[i] = scan.nextLine();
		}
	}

	public void find() {
		String word = "";
		for (int i = 0; i < array.length; i++) {
			word = array[i];
			for (int j = 0; j < word.length(); j++) {
				char temp = word.charAt(j);
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					counter++;
				}
			}
			array[i] = word + " - " + counter;
			word = "";
			counter = 0;
		}
	}

	public String print() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return "";
	}

	public String toString() {
		return print();
	}

}
