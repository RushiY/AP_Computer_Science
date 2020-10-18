package strings;
import static java.lang.System.*;

public class WordFunRunner {

	public static void main(String args[]) {

		WordFun test = new WordFun("Hello World");
		
		out.println(test);
		out.println();
		test.makeUpper();
		out.println(test);
		out.println();
		test.addHyphen();
		out.println(test);
		out.println();

		// add more test cases

		test.setWord("Jim Bob");
		
		out.println(test);
		out.println();
		test.makeUpper();
		out.println(test);
		out.println();
		test.addHyphen();
		out.println(test);
		out.println();
		
		test.setWord("Computer Science");
		
		out.println(test);
		out.println();
		test.makeUpper();
		out.println(test);
		out.println();
		test.addHyphen();
		out.println(test);
		out.println();
		
		test.setWord("UIL TCEA");
		
		out.println(test);
		out.println();
		test.makeUpper();
		out.println(test);
		out.println();
		test.addHyphen();
		out.println(test);
		out.println();

		test.setWord("State Champions");

		out.println(test);
		out.println();
		test.makeUpper();
		out.println(test);
		out.println();
		test.addHyphen();
		out.println(test);
		out.println();
	}
}
