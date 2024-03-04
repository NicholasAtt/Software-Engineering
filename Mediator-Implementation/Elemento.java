// Example for the Mediator design pattern
/** Elemento is a Colleague */

// Interface representing a Colleague in the Mediator pattern
public interface Elemento {

    // Method to handle receiving a string input
    public void put(final String s);

    // Method to handle receiving an integer input
    public void put(final int v);

    // Method to perform the specific work associated with the Colleague
    public String doWork();

    // Method to reset the state of the Colleague
    public void reset();
}
