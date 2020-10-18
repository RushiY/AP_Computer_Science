package hierarchies;

import java.util.Arrays;

public class Word2 implements Comparable<Word2> {
	private String word;

	public Word2(String s) {
		word = s;
	}

	private int numVowels() {
		String vowels = "AEIOUaeiou";
		int vowelCount = 0;

		for (int i = 0; i < word.length(); i++) {
			if ((word.charAt(i) == 'a') || (word.charAt(i) == 'e') || (word.charAt(i) == 'i') || (word.charAt(i) == 'o')
					|| (word.charAt(i) == 'u') || (word.charAt(i) == 'A') || (word.charAt(i) == 'E')
					|| (word.charAt(i) == 'I') || (word.charAt(i) == 'O') || (word.charAt(i) == 'U')) {
				vowelCount++;
			}
		}
		return vowelCount;
	}

	public String getWord() {
		return word;
	}

	public int compareTo(Word2 rhs) {
		if (this.numVowels() - rhs.numVowels() == 0) {
			return word.compareTo(rhs.word);
		} else if (word.length() - rhs.word.length() != 0 && this.numVowels() - rhs.numVowels() == 0) {
			return word.compareTo(rhs.word);
		} else {
			return this.numVowels() - rhs.numVowels();
		}
	}

	public String toString() {
		return word;
	}

}