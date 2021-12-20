package practica_carrera;

public class exercici3 {
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println(Messages.getString("exercici3.0")); //$NON-NLS-1$
	}

	public static void printTwo() {
		printOne();
		printOne();
	}

public static void printThree() {
		System.out.println("Hello World");
	}

	
}
