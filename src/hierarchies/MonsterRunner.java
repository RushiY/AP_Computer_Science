package hierarchies;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner {
	public static void main(String args[]) {
		Scanner key = new Scanner(System.in);

		// ask for name and size

		System.out.print("Enter 1st monster's name: ");
		String name1 = key.nextLine();

		System.out.print("Enter 1st monster's size: ");
		int size1 = key.nextInt();

		// instantiate monster one

		Monster mon1 = new Monster(name1, size1);

		// ask for name and size

		System.out.print("Enter 2nd monster's name: ");
		String name2 = key.next();

		System.out.print("Enter 2nd monster's size: ");
		int size2 = key.nextInt();

		// instantiate monster two

		Monster mon2 = new Monster(name2, size2);

		System.out.println("\n");
		System.out.println("Monster 1 - " + name1 + " " + size1);
		System.out.println("Monster 2 - " + name2 + " " + size2);
		System.out.println();

		if (mon1.getHowBig() == mon2.getHowBig()) {
			System.out.println("Monster One is EQUAL to Monster Two.");
		} else if (mon1.isSmaller(mon2)) {
			System.out.println("Monster One is SMALLER than Monster Two.");
		} else {
			System.out.println("Monster One is BIGGER than Monster Two.");
		}

		if (mon1.hasSameName(mon2)) {
			System.out.println("Monster One HAS the same name as Monster Two.");
		} else {
			System.out.println("Monster One DOES NOT HAVE the same name as Monster Two.");
		}

	}
}
