// This is a Java class named Dialog
public class Dialog {
    // Creating a static constant instance of AddrBook named 'book'
    private static final AddrBook book = new AddrBook(); // Instantiate AddrBook

    // Creating a static constant instance of Store named 'st'
    private static final Store st = new Store();

    // Creating a static constant instance of Persona with specific details named
    // 'p1'
    private static final Persona p1 = new Persona("Olivers", "Stones", "012345", "NY");

    // Creating another static constant instance of Persona with different details
    // named 'p2'
    private static final Persona p2 = new Persona("Piero", "Stone", "NYE", "211323");

    // The main method, where the program execution starts
    public static void main(String[] args) {
        // Attaching the 'st' Store as an observer to the 'book' AddrBook
        book.attach(st); // Register the store as an observer for the address book

        // Inserting the 'p1' Persona into the 'book' AddrBook
        book.insert(p1);

        // Inserting the 'p2' Persona into the 'book' AddrBook
        book.insert(p2);
    }
}
