package arrays;
import java.util.*;

public class Numbers {
	private int[] nums = new int[20];
	private int[] positives = new int[20];
	private int[] negatives = new int[20];
	private int p = 0; // logical size of positives array
	private int n = 0; // logical size of negatives array

	/**
	 * precondition: none postcondition: nums has been populated with random numbers
	 * in the range of -100 to 100.
	 */
	public void populateNums() {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int) (Math.random() * 201) - 100);
		}
	}

	/**
	 * precondition: none postcondition: positives has been populated with all the
	 * numbers in nums that were positive. The variable p has has been updated to
	 * reflect the logical size of positives array.
	 */
	public void populatePositives() {
		for (int i = 0; i < positives.length; i++) {
			for (int j = 0; j < positives.length; j++) {
				if (nums[i] >= 0) {
					positives[j] = nums[i];
					p++;
				}
			}
		}
	}

	/**
	 * precondition: none postcondition: negatives has been populated with all the
	 * numbers in nums that were negative. The variable n has has been updated to
	 * reflect the logical size of negatives array.
	 */
	public void populateNegatives() {
		for (int i = 0; i < negatives.length; i++) {
			for (int j = 0; j < negatives.length; j++) {
				if (nums[i] < 0) {
					negatives[j] = nums[i];
					n++;
				}
			}
		}
	}

	/**
	 * precondition: size >=0 postcondition: all the values of array have been
	 * printed from index 0 to the logical size of the array.
	 * 
	 * @param array the array to be printed.
	 * @param size  the logical size of array
	 */
	public String print(int[] array, int size) {
		size = nums.length;
		populateNums();
		for (int i = 0; i < array.length; i++) {
			array[i] = nums[i];
		}
		array = nums;
		System.out.println("Random Numbers = 20");
		System.out.println("======================");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		////////////////////////////////////////////////////////////////////////////
		p = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				p++;
			}
		}
		size = p;
		System.out.println("\n\nPositive Numbers = " + size);
		System.out.println("======================");
		for (int i = 0; i < positives.length; i++) {
			if (array[i] >= 0) {
				System.out.print(array[i] + " ");
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				n++;
			}
		}

		/////////////////////////////////////////////////////////////////////////
		size = n;
		System.out.println("\n\nNegative Numbers = " + size);
		System.out.println("======================");

		for (int i = 0; i < negatives.length; i++) {
			if (array[i] < 0) {
				System.out.print(array[i] + " ");
			}
		}

		return "";
	}

	/**
	 * precondition: none postcondition: all three arrays have been printed with
	 * appropriate labelling.
	 */

	@Override
	public String toString() {
		Numbers n = new Numbers();
		return n.print(new int[20], 0);
	}

	public static void main(String[] args) {
		Numbers app = new Numbers();
		app.populateNums();
		app.populatePositives();
		app.populateNegatives();
		System.out.println(app);
	}
}