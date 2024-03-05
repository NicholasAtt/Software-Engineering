// Client class instantiates and invokes methods

public class Client {
	// Initializing an instance of Messaggio with a chained composition of objects
	private Messaggio m = new Riduttore(new Testo("Tano", "There are four of us here"));

	public static void main(String[] args) {
		System.out.println("Instantiating... ");

		// Creating a Client object and invoking its test methods
		Client c = new Client();
		c.test();
		c.test2();
	}

	// Method to test the functionalities of the initialized Messaggio object
	private void test() {
		System.out.println("Invoking getTesto method... ");
		System.out.println("\ntesto: " + m.getTesto() + "\n"); // Displaying the result of getTesto method
		System.out.println("Invoking getDestin method... ");
		System.out.println("\ndestin: " + m.getDestin() + "\n"); // Displaying the result of getDestin method
	}

	// Method to test the functionalities of a new Messaggio object (m2)
	private void test2() {
		System.out.println("Instantiating m2... ");

		// Creating a new Messaggio object (m2) with a different composition of objects
		Messaggio m2 = new Riduttore(new Indirizzi(new Testo("Saro", "Saro, are you going to go home now?")));

		System.out.println("Invoking getTesto method... ");
		System.out.println("\ntesto: " + m2.getTesto() + "\n"); // Displaying the result of getTesto method for m2
		System.out.println("Invoking getDestin method... ");
		System.out.println("\ndestin: " + m2.getDestin() + "\n"); // Displaying the result of getDestin method for m2
	}
}
