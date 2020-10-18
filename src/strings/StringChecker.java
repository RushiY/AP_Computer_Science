package strings;
import static java.lang.System.*;

public class StringChecker {

	private String word;

	public StringChecker() {
		word = "";
	}

	public StringChecker(String s) {
		word = s;
	}

	public void setString(String s) {
		word = s;
	}

	public String getWord() {
		return word;
	}

	public boolean findLetter(char c) {
		String str = Character.toString(c);
		if (word.contains(str) == true) {
			return true;
		}
		return false;
	}

	public boolean findSubString(String s) {
		if (word.contains(s) == true) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "\n\n";
	}

}