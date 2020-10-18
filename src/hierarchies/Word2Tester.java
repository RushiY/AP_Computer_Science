package hierarchies;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Word2Tester {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("Word2Data.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word2[] words = new Word2[size];

		for (int i = 0; i < size; i++) {
			String word = file.next();
			words[i] = new Word2(word);
		}

		Arrays.sort(words);
		System.out.println(Arrays.toString(words));

	}
}