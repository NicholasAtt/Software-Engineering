import java.util.ArrayList;
import java.util.List;

// Should be concerned with creating a list of names
public class AddrBook extends Subject {
    private List<Persona> nomi = new ArrayList<>();

    // Inserts a person into the address book
    public void insert(Persona p) {
        // If the person is already in the list, return without adding
        if (nomi.contains(p))
            return;

        nomi.add(p); // Adding a person changes the aggregate of names, and thus, an object might be
                     // interested in this change

        setChanged(); // The next notification will occur when someone checks if I have done something
                      // to modify my state. Representing that a significant change has occurred, I
                      // set the flag on Subject.

        notify(nomi); // Notify the Observers
    }

    // Finds a person in the address book by last name
    public Persona find(String cognome) {
        for (Persona p : nomi)
            if (p.getCognome().equals(cognome))
                return p;

        System.out.println("AddrBook.find: NOT found");
        return null;
    }
}
