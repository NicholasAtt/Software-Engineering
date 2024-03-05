// Modificatore is a Decorator

public class Modificatore implements Messaggio {
	private Messaggio p;

	// Constructor taking a Messaggio object as a parameter
	public Modificatore(Messaggio c) {
		p = c;
	}

	// Overrides the getDestin method to add custom behavior
	public String getDestin() {
		System.out.print("[Modificatore.getDestin] ");

		// Calling the getDestin method of the wrapped Messaggio object
		return p.getDestin();
	}

	// Overrides the getTesto method to add custom behavior
	public String getTesto() {
		System.out.print("[Modificatore.getTesto] ");

		// Calling the getTesto method of the wrapped Messaggio object
		return p.getTesto();
	}
}
