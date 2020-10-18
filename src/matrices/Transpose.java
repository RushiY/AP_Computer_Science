package matrices;
import java.util.Scanner;

public class Transpose {
	private static int[][] array;
	private static int row;
	private static int column;

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.print("Enter number of rows --> ");
		row = key.nextInt();
		System.out.print("Enter number of columns --> ");
		column = key.nextInt();
		array = new int[row][column];

		original(array, row, column);
		new1(array, row, column);

	}

	public static void original(int[][] array, int row, int column) {
		System.out.println("\nOrigninal Matrix");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = ((int) (Math.random() * 200) + 1);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void new1(int[][] array, int row, int column) {
		System.out.println("\nTranspose");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static String print() {
		System.out.println("Original Matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		return "";
	}

	@Override
	public String toString() {
		return print();
	}
}
