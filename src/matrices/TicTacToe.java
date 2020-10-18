package matrices;

import java.util.Scanner;

public class TicTacToe {
	private char[][] mat;
	private String game;
	private boolean upDown;
	private boolean rightLeft;
	private boolean diagonal;
	private boolean tie;
	private char winner;

	public TicTacToe() {
		mat = new char[3][3];
		game = "";
	}

	public TicTacToe(String a) {
		game = a;
	}

	public void printMat() {
		mat = new char[3][3];
		int counter = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = game.charAt(counter);
				counter++;
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void getWinner() {

		for (int i = 0; i < mat.length; i++) { // rows
			if (mat[i][0] == mat[i][1] && mat[i][1] == mat[i][2]) {
				winner = mat[i][0];
				rightLeft = true;
			}
		}

		for (int j = 0; j < mat.length; j++) { // cols
			if (mat[0][j] == mat[1][j] && mat[1][j] == mat[2][j]) {
				winner = mat[0][j];
				upDown = true;
			}
		}

		if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]) { // diag left
			winner = mat[0][0];
			diagonal = true;
		}

		if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]) { // diag right
			winner = mat[0][2];
			diagonal = true;
		}
		
		
	}

	public String toString() {
		String output = "";
		if (upDown == true) {
			output = winner + " wins vertically!";
		} else if (rightLeft == true) {
			output = winner + " wins horizontally!";
		} else if (diagonal == true) {
			output = winner + " wins diagonally!";
		} else {
			output = "cat's game - no winner!";
		}

		return output + "\n\n";
	}
}
