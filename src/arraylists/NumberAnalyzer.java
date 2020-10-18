package arraylists;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer {
	private ArrayList<Number> list;
	private int[] num;

	public NumberAnalyzer() {
		list = new ArrayList<Number>();
	}

	public NumberAnalyzer(String numbers) {
		String[] nums = (numbers.split(" "));
		list = new ArrayList<Number>();
		num = new int[nums.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(nums[i]);
			Number a = new Number(num[i]);

			list.add(a);
		}
	}

	public void setList(String numbers) {
		String[] nums = (numbers.split(" "));
		num = new int[nums.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(nums[i]);
			list.add(new Number(num[i]));
		}
	}

	public int countOdds() {
		int oddCount = 0;
		for (int i = 0; i < list.size(); i++) {
			Number a = new Number(num[i]);
			if (a.isOdd() == true) {
				oddCount++;
			}
		}
		return oddCount;
	}

	public int countEvens() {
		int evenCount = 0;
		for (int i = 1; i < list.size(); i++) {
			Number a = new Number(num[i]);
			if (a.isOdd() == false) {
				evenCount++;
			}
		}
		return evenCount;
	}

	public int countPerfects() {
		int perfectCount = 0;
		for (int i = 1; i < list.size(); i++) {
			Number a = new Number(num[i]);
			if (a.isPerfect() == true) {
				perfectCount++;
			}
		}

		return perfectCount;
	}

	public String toString() {
		return "" + list;
	}
}