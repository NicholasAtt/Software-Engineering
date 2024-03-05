// Indirizzi is a ConcreteDecorator

public class Indirizzi extends Modificatore {
	// Constructor taking a Messaggio object as a parameter
	public Indirizzi(Messaggio c) {
		super(c);
	}

	// Overrides the getDestin method to assign a number to the recipient
	public String getDestin() {
		System.out.print("[Indirizzi.getDestin] ");

		// Calling the getDestin method of the wrapped Messaggio object
		String s = super.getDestin();

		// Modifying the recipient information by replacing specific names with
		// corresponding numbers
		s = s.replaceFirst("Tano", "3336543211");
		s = s.replaceFirst("Saro", "3939685732");

		// Returning the modified recipient information
		return s;
	}
}
