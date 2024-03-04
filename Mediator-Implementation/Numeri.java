/** Numeri is a ConcreteColleague */
public class Numeri implements Elemento {
    // Reference to the mediator (Central)
    private final Central m;

    // Array of predefined numbers for the user to guess
    private final int[] seq = { 8, 13, 21 };

    // Array to store user-entered numbers
    private final int[] num = new int[3];

    // Counter to keep track of the number of numbers entered by the user
    private int i = 0;

    // Constructor that takes a reference to the mediator (Central)
    public Numeri(final Central c) {
        m = c;
        // Display initial instructions to the user
        System.out.println("Guess the next three numbers in the sequence 2, 3, 5, ...");
    }

    // Method to handle receiving a string message (not used in Numeri)
    @Override
    public void put(final String msg) {
        // Print the entered string and provide feedback on the sequence correctness
        System.out.print(msg + " ");
        if (i == 3)
            System.out.println("Well done, correct sequence");
        else
            System.out.println("Incorrect sequence");
    }

    // Method to perform work based on the user-entered numbers
    @Override
    public String doWork() {
        // Display the numbers entered by the user
        System.out.println("You entered:  " + num[0] + "  " + num[1] + "  " + num[2]);

        // Check if the entered numbers match the predefined sequence
        if (seq[0] == num[0] && seq[1] == num[1] && seq[2] == num[2]) {
            System.out.println("You guessed the sequence");
            // Signal the mediator to stop the main loop
            m.stop();
        } else
            System.out.println("You did not guess the sequence, try again");

        // Reset the counter for the next round
        i = 0;
        return null;
    }

    // Method to handle receiving an integer value
    @Override
    public void put(final int v) {
        // Store the entered number in the array and increment the counter
        if (i < 3) {
            num[i] = v;
            i++;
        }
        // If three numbers have been entered, perform the specific work
        if (i == 3)
            doWork();
    }

    // Method to reset the state of the Numeri by resetting the counter
    @Override
    public void reset() {
        i = 0;
    }
}
