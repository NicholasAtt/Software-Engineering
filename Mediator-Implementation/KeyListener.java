import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** KeyListener is a ConcreteColleague */
public class KeyListener implements Elemento {
    // Reference to the mediator (Central)
    private final Central m;

    // Buffered reader for reading input
    private BufferedReader inp;

    // Counter to track the number of inputs
    private int count = 0;

    // Constructor that takes a reference to the mediator (Central)
    public KeyListener(final Central c) {
        m = c;
        // Display initial instructions to the user
        System.out.println("Enter a number or a letter and press enter");
        System.out.println("To exit, type q");
    }

    // Method to perform work, read input, and return the input as a string
    @Override
    public String doWork() {
        try {
            // Initialize the buffered reader to read input from the console
            inp = new BufferedReader(new InputStreamReader(System.in));

            // Read a line of input
            String str = inp.readLine();

            // Increment the input count
            count++;

            // Check if the input count reaches 10 and signal the mediator to stop
            if (count == 10)
                m.stop();

            // Return the read input as a string
            return str;
        } catch (final IOException ioe) {
            // Handle any IOException that may occur during input reading
            System.err.println(ioe);
        }
        return null;
    }

    // Method to handle receiving a string message
    @Override
    public void put(final String msg) {
        // Display the number of inputs received
        System.out.println("You have entered " + count + " inputs");
    }

    // Method to handle receiving an integer value (not used in KeyListener)
    @Override
    public void put(final int v) {
    }

    // Method to reset the state of the KeyListener (not implemented)
    @Override
    public void reset() {
        // Reset the state if needed
    }
}
