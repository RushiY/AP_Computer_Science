package arraylists;
import java.util.ArrayList;
import java.util.Scanner;

public class FactorList {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a number --> ");
		int input = key.nextInt();
		System.out.println(getListOfFactors(input));
	}

	/*
	 * *method getListOfFactors will return a list of *all of the factors of number
	 * � excluding number
	 */

	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp = number;
		for (int i = 1; i < temp; i++) {
			if (number % i == 0) {
				list.add(i);
			}
		}
		return list;

	}

}
