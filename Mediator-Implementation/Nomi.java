/** Nomi is a ConcreteColleague */
public class Nomi implements Elemento {
    // Reference to the mediator (Central)
    private final Central m;

    // Array of predefined names to be guessed
    private final String[] seq = { "Monica", "Erica", "Rita", "Tina", "Sandra", "Mary", "Jessica" };

    // Array to store user-entered names
    private final String[] nom = new String[3];

    // Initial index to start comparing names in the predefined sequence
    private final int iniz = 2;

    // Counter to keep track of the number of names entered by the user
    private int i = 0;

    // Constructor that takes a reference to the mediator (Central)
    public Nomi(final Central c) {
        m = c;
        // Display initial instructions to the user
        System.out.println("Guess the next three names: " + seq[0] + " " + seq[1] + " ...");
    }

    // Method to handle receiving a string message
    @Override
    public void put(final String msg) {
        // Store the entered name in the array and increment the counter
        if (i < 3) {
            nom[i] = msg;
            i++;
        }
        // If three names have been entered, perform the specific work
        if (i == 3)
            doWork();
    }

    // Method to perform work based on the user-entered names
    @Override
    public String doWork() {
        // Display the names entered by the user
        System.out.println("You entered:  " + nom[0] + "  " + nom[1] + "  " + nom[2]);

        // Check if the entered names match the predefined sequence
        if (seq[iniz].equals(nom[0]) && seq[iniz + 1].equals(nom[1]) && seq[iniz + 2].equals(nom[2])) {
            System.out.println("Well done, the names are correct");
            // Signal the mediator to stop the main loop
            m.stop();
        } else
            System.out.println("You did not guess the names, try again");

        // Reset the counter for the next round
        i = 0;
        return null;
    }

    // Method to handle receiving an integer value
    @Override
    public void put(final int v) {
        // Provide feedback based on whether the user guessed the name sequence
        if (i == 3)
            System.out.println("Well done! You guessed the name sequence");
        else
            System.out.println("You did not guess the name sequence");
    }

    // Method to reset the state of the Nomi (not implemented)
    @Override
    public void reset() {
        // Reset the state if needed
    }
}
