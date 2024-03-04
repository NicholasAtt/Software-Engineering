// This class represents a person with basic personal information.
public class Persona {
    // Private fields to store personal information.
    private String nome; // Person's first name
    private String cognome; // Person's last name
    private String indirizzo; // Person's address
    private String numeroTelefono; // Person's phone number

    // Constructor to initialize a Persona object with the provided information.
    public Persona(String nome, String cognome, String indirizzo, String numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numeroTelefono = numeroTelefono;
    }

    // Getter method for retrieving the person's first name.
    public String getNome() {
        return nome;
    }

    // Setter method for updating the person's first name.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter method for retrieving the person's last name.
    public String getCognome() {
        return cognome;
    }

    // Setter method for updating the person's last name.
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    // Getter method for retrieving the person's address.
    public String getIndirizzo() {
        return indirizzo;
    }

    // Setter method for updating the person's address.
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    // Getter method for retrieving the person's phone number.
    public String getTelefono() {
        return numeroTelefono;
    }

    // Setter method for updating the person's phone number.
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
