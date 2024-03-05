// Testo is a ConcreteComponent

public class Testo implements Messaggio {
	private String dest;
	private String testo;

	// Constructor taking destination and text parameters
	public Testo(String d, String t) {
		dest = d;
		testo = t;
	}

	// Overrides the getDestin method to return the destination
	public String getDestin() {
		System.out.print("[Testo.getDestin] ");
		return dest;
	}

	// Overrides the getTesto method to return the message text
	public String getTesto() {
		System.out.print("[Testo.getTesto] ");
		return testo;
	}
}
