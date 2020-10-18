package hierarchies;

import java.util.Arrays;
import java.util.Collections;

public class Word implements Comparable<Word> {
	private String word;

	public Word(String s) {
		word = s;
	}

	@Override
	public int compareTo(Word rhs) {
		if (word.length() - rhs.word.length() == 0) {
			return word.compareTo(rhs.word);
		} else {
			return word.length() - rhs.word.length();
		}

	}

	public String toString() {
		return word;
	}

}