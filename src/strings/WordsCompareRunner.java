package strings;
import static java.lang.System.*;

public class WordsCompareRunner {

	public static void main(String args[]) {

		WordsCompare word1 = new WordsCompare("abe", "ape");
		word1.compare();
		out.println(word1);
		
		WordsCompare word2 = new WordsCompare("giraffe", "gorila");
		word2.compare();
		out.println(word2);

		WordsCompare word3 = new WordsCompare("one", "two");
		word3.compare();
		out.println(word3);

		WordsCompare word4 = new WordsCompare("fun", "funny");
		word4.compare();
		out.println(word4);

		WordsCompare word5 = new WordsCompare("123", "19");
		word5.compare();
		out.println(word5);

		WordsCompare word6 = new WordsCompare("193", "1910");
		word6.compare();
		out.println(word6);

		WordsCompare word7 = new WordsCompare("goofy", "grandfather");
		word7.compare();
		out.println(word7);

		WordsCompare word8 = new WordsCompare("funnel", "fun");
		word8.compare();
		out.println(word8);

	}

}