/* The client expects an implementation of the ILabel interface, which defines the getNextLabel() method.
 In the provided code, the Label class is the adapter that implements the ILabel interface
 and adjusts the functionality of the LabelServer class (which is the adaptee)
 to satisfy the interface required by the client.

 In the main method of the Client class, a Label object is instantiated
 by passing the prefix "LAB" to the constructor.
 Subsequently, the getNextLabel() method is called on the object 's' of type ILabel,
 which is actually an instance of the Label class.

 Internally, the Label class maintains a reference to a LabelServer object in the variable 'ls'.
 When the getNextLabel() method is called, it checks if the 'ls' object is null.
 If it is null, a new LabelServer object is created with the prefix passed to the Label constructor,
 and then the serveNextLabel() method is called on the 'ls' object to obtain the next label number.
 The serveNextLabel() method returns a string that combines the prefix and the incremented label number.

 In the test performed in the main method, it checks if the string returned by the getNextLabel() method
 is equal to "LAB1". If it is, the message "Test 1: Passed" is printed;
 otherwise, the message "Test 1: Failed" is printed. */

public class Client {
    public static void main(String args[]) {
        ILabel s = new Label("LAB");
        String l = s.getNextLabel();
        if (l.equals("LAB1"))
            System.out.println("Test 1:Passed");
        else
            System.out.println("Test1:Failed");
    }
}
