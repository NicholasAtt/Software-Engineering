import java.util.ArrayList;
import java.util.List;

// Custom implementation of the Subject class
public class Subject {
    private List<Observer> obs = new ArrayList<>(); // ArrayList to store observers (observers are of type interface)
    private boolean changed = false; // Flag to track whether the state has changed

    // Method to notify observers about the change in state
    public void notify(Object state) { // Pass the state to the observers
        // If no change in state, return without notifying observers
        if (!changed)
            return;

        // Iterate through all registered observers and invoke their update method
        for (Observer o : obs) {
            o.update(this, state); // Pass 'this' (a reference to the instance at runtime) and the updated state
        }

        changed = false; // Reset the flag after notifying observers
    }

    // Method to indicate that the state has changed
    public void setChanged() {
        changed = true;
    }

    // Method to attach an observer to the subject
    public void attach(Observer o) {
        obs.add(o);
    }

    // Method to detach an observer from the subject
    public void detach(Observer o) {
        obs.remove(o);
    }
}
