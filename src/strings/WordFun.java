package strings;
import static java.lang.System.*;

public class WordFun {
	private String word;

	public WordFun() {
		word = "";
	}

	public WordFun(String w) {
		word = w;
	}

	public void setWord(String w) {
		word = w;
	}

	public void makeUpper() {
		word = word.toUpperCase();
	}

	public void addHyphen() {
		// String[] one = word.split(" ");
		String[] two = word.split(" ");
		word = two[0] + "-" + two[1];
	}

	public String toString() {
		return word;
	}
}