package matrices;

public class KittyMapRunner {
	public static void main(String args[]) {
		KittyMap km = new KittyMap(10, 10);
		System.out.println(km);
		km.printKittyCount();
	}
}