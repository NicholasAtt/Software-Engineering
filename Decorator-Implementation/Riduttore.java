// Riduttore is a ConcreteDecorator

public class Riduttore extends Modificatore {
	// Constructor taking a Messaggio object as a parameter
	public Riduttore(Messaggio c) {
		super(c);
	}

	// Overrides the getTesto method to transform the text provided by the innermost
	// component
	public String getTesto() {
		System.out.print("[Riduttore.getTesto] ");

		// Calling the getTesto method of the wrapped Messaggio object
		String s = super.getTesto();

		// Transforming the text by replacing specific substrings with alternative
		// representations
		s = s.replaceAll("!", "");
		s = s.replaceAll("four", "4");
		s = s.replaceAll("going to", "gonna");
		s = s.replaceAll("would you", "wonna");

		// Returning the transformed text
		return s;
	}
}
