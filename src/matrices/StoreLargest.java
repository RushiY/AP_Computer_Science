package matrices;
public class StoreLargest {

	public static void main(String[] args) {
		int row = 4;
		int column = 4;
		int[][] array = new int[row][column];
		int[][] array2 = new int[row][column];
		int[][] temp = new int[row][column];

		matrix1(array, row, column);
		matrix2(array2, row, column);
		matrix3(array, array2, temp, row, column);
		print(temp);

	}

	public static void matrix1(int[][] array, int row, int column) {
		System.out.println("Matrix 1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = ((int) (Math.random() * 10) + 0);
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void matrix2(int[][] array2, int row, int column) {
		System.out.println("\nMatrix 2");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array2[i][j] = ((int) (Math.random() * 10) + 0);
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void matrix3(int[][] array, int[][] array2, int[][] temp, int row, int column) {
		System.out.println("\nLargest Elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (array2[i][j] < array[i][j]) {
					temp[i][j] = array[i][j];
				} else {
					temp[i][j] = array2[i][j];
				}
			}
		}
	}

	public static void print(int[][] temp) {
		for (int[] temp1 : temp) {
			for (int i : temp1) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}