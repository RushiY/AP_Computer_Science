package matrices;
import java.util.Scanner;

public class SumMatrix {
	private static int row;
	private static int col;

	private static int matrix[][];

	public static void main(String[] args) {
		input();
		matrix();
		newMatrix();
	}

	public static void input() {
		Scanner key = new Scanner(System.in);

		System.out.print("Enter number of rows --> ");
		row = key.nextInt();
		System.out.print("Enter number of columns --> ");
		col = key.nextInt();
		System.out.println();
	}

	public static void matrix() {
		matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static void newMatrix() {

		for (int i = 0; i < row; i++) {
			int rowSum = 0;
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
				rowSum += matrix[i][j];
			}
			System.out.println(" " + rowSum);
		}

		for (int i = 0; i < col; i++) {
			int colSum = 0;
			for (int j = 0; j < row; j++) {
				colSum += matrix[j][i];
			}

			if (i == 0) {
				System.out.println();
			}
			System.out.print(colSum + " ");
		}
	}
}
