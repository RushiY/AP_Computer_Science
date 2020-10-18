package hierarchies;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster2 implements Comparable {
	private int myWeight;
	private int myHeight;
	private int myAge;

	// write a default Constructor

	public Monster2() {
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}

	// write an initialization constructor with an int parameter ht

	public Monster2(int ht) {
		myHeight = ht;
	}

	// write an initialization constructor with int parameters ht and wt

	public Monster2(int ht, int wt) {
		myHeight = ht;
		myWeight = wt;
	}

	// write an initialization constructor with int parameters ht, wt, and age

	public Monster2(int ht, int wt, int age) {
		myHeight = ht;
		myWeight = wt;
		myAge = age;
	}

	// modifiers - write set methods for height, weight, and age

	public void setHeight(int h) {
		myHeight = h;
	}

	public void setWeight(int w) {
		myWeight = w;
	}

	public void setAge(int a) {
		myAge = a;
	}

	// accessors - write get methods for height, weight, and age

	public int getHeight() {
		return myHeight;
	}

	public int getWeight() {
		return myWeight;
	}

	public int getAge() {
		return myAge;
	}

	// creates a new copy of this Object
	public Monster2 clone() {
		return new Monster2(this.myHeight, this.myWeight, this.myAge);
	}

	public boolean equals(Object obj) {

		return false;
	}

	public int compareTo(Object obj) {
		Monster2 rhs = (Monster2) obj;
		if (rhs.getHeight() > getHeight()) {
			return -1;
		} else if (rhs.getWeight() > getWeight()) {
			return -1;
		} else if (rhs.getAge() > getAge()) {
			return -1;
		} else {
			return 1;
		}
	}

	// write a toString() method

	public String toString() {
		return getHeight() + " " + getWeight() + " " + getAge();
	}

}