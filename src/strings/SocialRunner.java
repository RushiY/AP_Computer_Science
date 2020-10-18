package strings;
import static java.lang.System.*;

public class SocialRunner {

	public static void main(String args[]) {

		// add test cases

		Social n = new Social("09-111-030");
		n.chopAndAdd();
		System.out.println(n);
		n.setWord("1-1-1");
		n.chopAndAdd();
		System.out.println(n);
		n.setWord("182-2-12");
		n.chopAndAdd();
		System.out.println(n);
		n.setWord("0-0-0");
		n.chopAndAdd();
		System.out.println(n);
	}

}
