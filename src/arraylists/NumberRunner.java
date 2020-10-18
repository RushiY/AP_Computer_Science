package arraylists;
public class NumberRunner {
	public static void main(String[] args) {
		Number one = new Number(7);
		System.out.println(one);
		System.out.println(one + " isOdd == " + one.isOdd());
		System.out.println(one + " isPerfect == " + one.isPerfect());

		one.setNumber(496);
		System.out.println("\n" + one);
		System.out.println(one + " isOdd == " + one.isOdd());
		System.out.println(one + " isPerfect == " + one.isPerfect());

		one.setNumber(12);
		System.out.println("\n" + one);
		System.out.println(one + " isOdd == " + one.isOdd());
		System.out.println(one + " isPerfect == " + one.isPerfect());

		one.setNumber(89);
		System.out.println("\n" + one);
		System.out.println(one + " isOdd == " + one.isOdd());
		System.out.println(one + " isPerfect == " + one.isPerfect());
	}
}
