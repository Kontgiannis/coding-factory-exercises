package gr.aueb.cf.cf9.ch11;

public class User {
    private Long id;
     private String firstname;
    private String lastname;
// Default constructor
    public User() {}
    // Overloaded constructor
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public Long getID() { return id;}
    public String getFirstname() { return firstname;}
    public String getLastname() {return lastname;}
    public void setId(Long id) {this.id = id;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
}
