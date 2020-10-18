package matrices;

import java.util.Scanner;
import java.io.*;

public class TicTacToeRunner {

	public static void main(String args[]) throws IOException {
		File temp = new File("TicTacToe.dat");
		Scanner key = new Scanner(temp);
		key.nextLine();
		while (key.hasNextLine()) {
			String line = key.nextLine();
			TicTacToe game = new TicTacToe(line);
			game.printMat();
			game.getWinner();
			System.out.println(game);
		}
	}
}