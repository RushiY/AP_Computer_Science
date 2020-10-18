package arraylists;

import java.util.*; // needed for ArrayList

public class ArrayListPractice {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Method 1");
		System.out.println("--------");
		System.out.println();
		Method1();
		System.out.println();
		System.out.println("Method 2");
		System.out.println("--------");
		System.out.println();
		Method2();
	}

	public static void Method1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			list.add((i * 10));
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();

		for (Integer i : list) {
			System.out.println(i);
		}
	}

	public static void Method2() {
		Scanner key = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("Enter words - type exit when finished.");

		String temp = "";
		int counter = 0;
		while (!temp.equals("exit")) {
			System.out.print("Enter a word --> ");
			temp = key.nextLine();
			list.add(temp);
			counter++;
		}

		list.remove((counter - 1));

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();

		for (String i : list) {
			System.out.println(i);
		}

	}
}
