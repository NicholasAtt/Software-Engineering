/** Central is a Mediator */
public class Central {
    // Instances of different elements with a reference to the current mediator
    // (this)
    private Elemento s = new Sommatore(this);
    private Elemento k = new KeyListener(this);
    private Elemento n = new Numeri(this);
    private Elemento nm = new Nomi(this);

    // Flag to control the main loop
    private boolean active = true;

    // Activates the keyListener in a loop
    public void init() {
        String s;
        do {
            // Perform work using the keyListener and check for the termination condition
            s = k.doWork();
            if (s.equals("q"))
                break;

            // Process the received data
            alert(s);
        } while (active);
    }

    // Routes the data read by the keyListener to other nodes (n, s, nm)
    // This is an internal function of Central
    public void alert(String str) {
        try {
            // Try to parse the input as an integer
            int v = Integer.parseInt(str);

            // Pass the integer value to the associated elements
            s.put(v);
            n.put(v);
        } catch (NumberFormatException nfe) {
            // If parsing fails, reset some elements and pass the input as a string to nm
            n.reset();
            s.reset();
            nm.put(str);
        }
    }

    // Signals the stop condition to terminate the main loop
    public void stop() {
        active = false;

        // Send stop signals to the associated elements
        n.put("Numeri:");
        s.put("Somma:");
        nm.put(0);
    }
}
