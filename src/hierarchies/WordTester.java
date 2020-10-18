package hierarchies;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordTester {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("WordData.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word[] words = new Word[size];

		for (int i = 0; i < size; i++) {
			String word = file.next();
			words[i] = new Word(word);
		}

		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
	}
}