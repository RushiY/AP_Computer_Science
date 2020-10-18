package arrays;
public class Player {
	// instance variables
	private String playerName;
	private int ftm;
	private int fta;
	private int fg2m;
	private int fg2a;
	private int fg3m;
	private int fg3a;

	// constructors

	public Player(String name, int ftm2, int fta2, int fg2m2, int fg2a2, int fg3m2, int fg3a2) {
		playerName = name;
		ftm = ftm2;
		fta = fta2;
		fg2m = fg2m2;
		fg2a = fg2a2;
		fg3m = fg3m2;
		fg3a = fg3a2;

	}

	// accessor methods
	public void setPlayerName(String p) {
		playerName = p;
	}

	public void setFTM(int f) {
		ftm = f;
	}

	public void setFTA(int f) {
		fta = f;
	}

	public void setFG2M(int f) {
		fg2m = f;
	}

	public void setFG2A(int f) {
		fg2a = f;
	}

	public void setFG3M(int f) {
		fg3m = f;
	}

	public void setFG3A(int f) {
		fg3a = f;
	}

	// other methods
	public double getFTPercentage() {
		return ((double) ftm / fta) * 100;
	}

	public double getFG2Percentage() {
		return ((double) fg2m / fg2a) * 100;
	}

	public double getFG3Percentage() {
		return ((double) fg3m / fg3a) * 100;
	}

	public double getPointsScored() {
		return ftm + fg2m * 2 + fg3m * 3;
	}
}