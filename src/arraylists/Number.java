package arraylists;
public class Number {
	private int number;

	public Number() {
		number = 0;
	}

	public Number(int num) {
		number = num;
	}

	public void setNumber(int num) {
		number = num;
	}

	public int getNumber() {
		return number;
	}

	public boolean isOdd() {
		if (number % 2 == 0) {
			return false;
		}
		return true;
	}

	public boolean isPerfect() {
		int total = 0;
		int temp = number;
		for (int i = 1; i < temp; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		return (number == total);
	}

	public String toString() {
		return "" + number;
	}
}