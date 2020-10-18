package matrices;

public class KittyMap { ////////////////////////////// is magic square due or pascal square
	private static boolean[][] kittyGrid;
	private static int[][] kittyMap;

	/*
	 * this constructor loads in random true and false values
	 */
	public KittyMap(int rows, int cols) {
		kittyGrid = new boolean[rows][cols];
		kittyMap = new int[rows][cols];

		for (int i = 0; i < rows; i++) { // rows
			for (int j = 0; j < cols; j++) { // cols
				int temp = (int) (Math.random() * 10) + 0; // 30%
				if (temp == 0 || temp == 1 || temp == 2) {
					kittyGrid[i][j] = true;
					kittyMap[i][j] = 9;
				} else {
					kittyGrid[i][j] = false;
					kittyMap[i][j] = 0;
				}

			}
		}

	}

	/*
	 * this method will call getKittyCount to retrieve the total count of kitties in
	 * the grid
	 */
	public void printKittyCount() {
		System.out.println("\nThere are " + getKittyCount(10, 10) + " kitties."); // Sys out at the end

	}

	/*
	 * this method will calculate the kitty counts for each cell if cell is true set
	 * integer value to 9 if cell is not true set integer value to count of kitties
	 * in adjacent cells
	 */
	private static int[][] getKittyCountsGrid() {
		int counter = 0;

		for (int i = 0; i < kittyGrid.length; i++) { // row
			for (int j = 0; j < kittyGrid[i].length; j++) { // col

				if (inBounds(i + 1, j) == true && kittyMap[i + 1][j] == 9) {// right
					counter++;
				}

				if (inBounds(i - 1, j) == true && kittyMap[i - 1][j] == 9) {// left
					counter++;
				}

				if (inBounds(i - 1, j + 1) == true && kittyMap[i - 1][j + 1] == 9) {// top left
					counter++;
				}

				if (inBounds(i, j + 1) == true && kittyMap[i][j + 1] == 9) {// top middle
					counter++;
				}

				if (inBounds(i + 1, j + 1) == true && kittyMap[i + 1][j + 1] == 9) {// top right
					counter++;
				}

				if (inBounds(i - 1, j - 1) == true && kittyMap[i - 1][j - 1] == 9) {// bottom left
					counter++;
				}

				if (inBounds(i, j - 1) == true && kittyMap[i][j - 1] == 9) {// bottom middle
					counter++;
				}

				if (inBounds(i + 1, j - 1) == true && kittyMap[i + 1][j - 1] == 9) {// bottom right
					counter++;
				}

				if (kittyMap[i][j] == 9) {// is it a bomb??
					counter = 9;
				}

				kittyMap[i][j] = counter;
				counter = 0;

			}
		}
		return kittyMap;
	}

	/*
	 * This method will return the total count of kitties in the the grid
	 */
	public static int getKittyCount(int r, int c) { // number of bombs
		int counter = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (kittyGrid[i][j] == true) {
					counter++;
				}
			}
		}
		return counter;
	}

	/*
	 * check r and c to ensure they are inside the grid
	 */
	private static boolean inBounds(int r, int c) {
		if (r < kittyMap.length && r >= 0 && c < kittyMap.length && c >= 0) { // less than 10 and more than 0
			return true;
		}

		return false;
	}

	/*
	 * return the kitty grid as a string
	 */

	@Override
	public String toString() {
		getKittyCountsGrid();
		String output = "";

		output += "Boolean Grid: \n";
		for (int i = 0; i < kittyGrid.length; i++) {
			for (int j = 0; j < kittyGrid[i].length; j++) {
				if (kittyGrid[i][j] == true) {
					output += "1 ";
				} else {
					output += "0 ";
				}
			}
			output += "\n";
		}
		output += "\nKitty Map Grid:\n";
		for (int i = 0; i < kittyGrid.length; i++) {
			for (int j = 0; j < kittyGrid[i].length; j++) {
				output += kittyMap[i][j] + " ";
			}
			output += "\n";
		}

		output += "\n\n";

		return output.trim(); // takes out extra spaces
	}
}
