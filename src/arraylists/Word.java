package arraylists;
public class Word {
	private String word;

	public Word() {
		word = "";

	}

	public Word(String wrd) {
		word = wrd;
	}

	public void setWord(String wrd) {
		word = wrd;
	}

	public int getNumVowels() {
		int counter = 0;

		for (int i = 0; i < word.length(); i++) {
			char temp = word.charAt(i);
			if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
				counter++;
			}
		}

		return counter;
	}

	public int getLength() {
		int counter = 0;

		for (int i = 0; i < word.length(); i++) {
			counter++;
		}

		return counter;
	}

	public String toString() {
		return word;
	}

	public String getWord() {
		return word;
	}
}