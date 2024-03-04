// This interface represents the Observer in the Observer design pattern.
public interface Observer {
    /*
     * This method is called to notify the Observer about changes in the Subject.
     * The 'update' method takes a Subject and an Object as parameters.
     * - 's': Represents the Subject, which can be an instance of any class
     * implementing the Subject interface.
     * - 'o': Represents additional information related to the update, and it is of
     * type Object.
     */
    public void update(Subject s, Object o);
}
