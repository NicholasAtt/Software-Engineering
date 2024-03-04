import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// Implementing the Observer interface
public class Store implements Observer {

    // Method to update the state of the observer when notified by the subject
    @Override
    public void update(Subject s, Object o) { // 's' is the subject, and 'o' is the updated state
        // Casting the updated state to a List of Persona objects
        List<Persona> l = (List<Persona>) o;

        // Variables to store persona information
        String nom;

        // Using try-with-resources to automatically close the FileWriter
        try (FileWriter f = new FileWriter("nomi.txt")) {
            // Iterating through the list of Persona objects
            for (Persona p : l) {
                // Creating a string with persona information
                nom = p.getNome() + "\t" + p.getCognome() +
                        "\t" + p.getTelefono();

                // Writing the persona information to the file with a newline character
                f.write(nom + "\n");
            }
        } catch (IOException e) {
            // Handling IOException, although it does not contain specific actions in this
            // case
        }
    }
}
