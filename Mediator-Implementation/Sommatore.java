/** Sommatore is a ConcreteColleague */
public class Sommatore implements Elemento {
    // Reference to the mediator (Central)
    private final Central m;

    // Variables to store the sum, count of numbers, and the calculated average
    private int somma = 0;
    private int count = 0;
    private int media = 0;

    // Constructor that takes a reference to the mediator (Central)
    public Sommatore(final Central c) {
        m = c;
    }

    // Method to handle receiving a string message
    @Override
    public void put(final String msg) {
        // Print the received string and perform specific work
        System.out.println(msg);
        doWork();
        // Print the calculated sum and average
        System.out.println("The sum is: " + somma);
        System.out.println("The average is: " + media);
    }

    // Method to perform work (calculate the average)
    @Override
    public String doWork() {
        // Calculate the average if there are numbers in the sum
        if (count > 0)
            media = somma / count;
        return null;
    }

    // Method to handle receiving an integer value
    @Override
    public void put(final int v) {
        // Increment the count, add the value to the sum, and check for termination
        // condition
        count++;
        somma += v;
        if (somma >= 100)
            // Signal the mediator to stop the main loop
            m.stop();
    }

    // Method to reset the state of the Sommatore by resetting the sum and count
    @Override
    public void reset() {
        somma = 0;
        count = 0;
    }
}
