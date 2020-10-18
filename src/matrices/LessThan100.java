package matrices;

import java.util.Scanner;

public class LessThan100 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter matrix size --> ");
		int row = key.nextInt();
		int column = key.nextInt();

		int[][] array = new int[row][column];

		generate(array, row, column);
		lessThan(array, row, column);
	}

	public static void generate(int[][] array, int row, int column) {
		System.out.println("Generated Matrix");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = ((int) (Math.random() * 200) + 1);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void lessThan(int[][] array, int row, int column) {
		System.out.println("\nNumbers Less Than 100");
		System.out.println();
		System.out.println(" Row         Column");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (array[i][j] >= 100) {
					System.out.println("  " + i + "           " + j);
				}
			}
		}
	}

}
