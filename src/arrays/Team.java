package arrays;
import java.util.*;

public class Team {
	// instance variables
	private Player[] player; // declare array variable
	private int numPlayer;
	private String name;
	private int ftm;
	private int fta;
	private int fg2m;
	private int fg2a;
	private int fg3m;
	private int fg3a;

	// constructor
	public Team() {
		player = new Player[20]; // instantiate array with length 20
		numPlayer = 0; // no books added yet
	}

	/*
	 * This method allows a user to input up to 20 basketball players and stores
	 * them in an array.
	 */
	public void addPlayers() {
		String temp = "y";
		Scanner keyboard = new Scanner(System.in);

		while (temp.equals("y")) {
			System.out.print("Enter player name --> ");
			name = keyboard.nextLine();
			System.out.print("Enter free throws made --> ");
			ftm = keyboard.nextInt();
			System.out.print("Enter free throws attempted --> ");
			fta = keyboard.nextInt();
			System.out.print("Enter 2 pt field goals made --> ");
			fg2m = keyboard.nextInt();
			System.out.print("Enter 2 pt field goals attempted --> ");
			fg2a = keyboard.nextInt();
			System.out.print("Enter 3 pt fields goals made --> ");
			fg3m = keyboard.nextInt();
			System.out.print("Enter 3 pt field goals attempted --> ");
			fg3a = keyboard.nextInt();

			player[numPlayer] = new Player(name, ftm, fta, fg2m, fg2a, fg3m, fg3a);
			numPlayer += 1;
			System.out.println();
			System.out.println("Enter another player [y/n]: ");
			String boo = keyboard.nextLine();
			temp = keyboard.nextLine();
		}
	}

	/*
	 * This method displays each Player in the array
	 */
	public void printPlayers() {
		Player a = new Player(name, ftm, fta, fg2m, fg2a, fg3m, fg3a);
		for (int i = 0; i < numPlayer; i++) {
			System.out.println("Name = " + name);
			System.out.println("Free Throws % = " + a.getFTPercentage());
			System.out.println("2 pt Field Goal % = " + a.getFG2Percentage());
			System.out.println("3 pt Field Goal % = " + a.getFG3Percentage());
			System.out.println("Total Points Scored = " + a.getPointsScored());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Team app = new Team();
		app.addPlayers();
		app.printPlayers();
	}
}