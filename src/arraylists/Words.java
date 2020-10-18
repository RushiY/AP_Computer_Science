package arraylists;
import java.util.ArrayList;

public class Words {
	private ArrayList<Word> words;

	public Words() {
		setWords("");
		words = new ArrayList<Word>();
	}

	public Words(String wordList) {
		words = new ArrayList<Word>();

		String[] temp = (wordList.split(" "));
		for (int i = 0; i < temp.length; i++) {
			words.add(new Word(temp[i]));
		}
	}

	public void setWords(String wordList) {
		String[] temp = (wordList.split(" "));
		for (int i = 0; i < temp.length; i++) {
			words.add(new Word(temp[i]));
		}
	}

	public int countWordsWithXChars(int size) {
		int counter = 0;
		int logical = 0;

		for (int i = 0; i < words.size(); i++) {
			String temp = words.get(i).getWord();

			for (int j = 0; j < temp.length(); j++) {
				logical++;
			}
			if (logical == size) {
				counter++;
			}
			logical = 0;
		}

		return counter;
	}

// this method will remove all words with a specified size / length
// this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size) {
		int counter = 0;
		int logical = 0;
		ArrayList<Word> list = new ArrayList<Word>();

		for (int i = 0; i < words.size(); i++) { // word
			String temp = words.get(i).getWord();

			for (int j = 0; j < temp.length(); j++) { // letter
				logical++;
			}
			if (logical == size) {
				list.add(new Word(temp));
				words.remove(i--);
			}
			logical = 0;
		}

		for (int i = 0; i < list.size(); i++) {// word
			for (int j = 0; j < list.get(i).getLength(); j++) {// letter
				char temp = list.get(i).getWord().charAt(j);
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'A'
						|| temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
					counter++;
				}
			}
		}
		return counter;
	}

	public int countWordsWithXVowels(int numVowels) {
		int counter = 0;
		int logical = 0;

		for (int i = 0; i < words.size(); i++) {

			for (int j = 0; j < words.get(i).getLength(); j++) {
				char temp = words.get(i).getWord().charAt(j);
				if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U' || temp == 'a'
						|| temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					logical++;
				}
			}
			if (logical == numVowels) {
				counter++;
			}
		}

		return counter;
	}

	public String toString() {
		return "" + words;
	}
}
