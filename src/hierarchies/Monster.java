package hierarchies;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster {
	private String name;
	private int howBig;

	public Monster() {
		name = "";
		howBig = 0;
	}

	public Monster(String n, int size) {
		name = n;
		howBig = size;
	}

	public String getName() {
		return name;
	}

	public int getHowBig() {
		return howBig;
	}

	public boolean isBigger(Monster other) {
		return getHowBig() > other.getHowBig();
	}

	public boolean isSmaller(Monster other) {
		return !isBigger(other);
	}

	public boolean hasSameName(Monster other) {
		return name.equalsIgnoreCase(other.getName());
	}

	public String toString() {
		return getName() + " " + getHowBig();
	}
}