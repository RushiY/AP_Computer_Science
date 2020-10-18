package strings;

public class Stringercise {
	private static String word;
	private static int num1 = 5;
	private static int num2 = 15;
	private static int num3 = 21;

	public static void step1() {
		word = "Rushi";
		System.out.println("1. " + word);
	}

	public static void step2() {
		word += " Sai";
		System.out.println("2. " + word);
	}

	public static void step3() {
		word = word.concat(" Yalamanchili");
		System.out.println("3. " + word);
	}

	public static void step4() {
		word = word.toLowerCase();
		System.out.println("4. " + word);
	}

	public static void step5() {
		word = word.toUpperCase();
		System.out.println("5. " + word);
	}

	public static void step6() {
		System.out.println("6. " + word.length());
	}

	public static void step7() {
		System.out
				.println("7. " + word.substring(0, 5) + "\n   " + word.substring(6, 9) + "\n   " + word.substring(10));
	}

	public static void step8() {
		System.out.println("8. " + word.charAt(0) + word.charAt(6) + word.charAt(10));
	}

	public static void step9() {
		System.out.println("9. " + word.indexOf(word.charAt(6)));
	}

	public static void step10() {
		System.out.println("10. " + word.replace(word.charAt(0), 'X'));
	}

	public static void step11() {
		String t1 = Integer.toString(num1);
		String t2 = Integer.toString(num2);
		String t3 = Integer.toString(num3);
		System.out.println("11. " + t1 + ", " + t2 + ", " + t3);
	}

	public static void step12() {
		String t1 = Integer.toString(num1);
		String t2 = Integer.toString(num2);
		String t3 = Integer.toString(num3);

		int n = t1.compareTo("14");
		int n1 = t2.compareTo("14");
		int n2 = t3.compareTo("14");

		System.out.println("12. " + n + ", " + n1 + ", " + n2);

	}

	public static void step13() {
		String t1 = Integer.toString(num1);
		String t2 = Integer.toString(num2);
		String t3 = Integer.toString(num3);

		int n1 = Integer.parseInt(t1);
		int n2 = Integer.parseInt(t2);
		int n3 = Integer.parseInt(t3);

		int total = n1 + n2 + n3;

		System.out.println("13. " + total);
	}

	public static void main(String[] args) {
		step1();
		step2();
		step3();
		step4();
		step5();
		step6();
		step7();
		step8();
		step9();
		step10();
		step11();
		step12();
		step13();
	}
}
