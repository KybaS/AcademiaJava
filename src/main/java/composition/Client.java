package composition;

public class Client {

    private String firstName;
    private String lastName;
    private Data dateOfBirth;
    private Data becameOurClient;
    private MassIndex mass;

    Client(String firstName, String lastName, Data dayOfBirth, Data becameOurClient, MassIndex mass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dayOfBirth;
        this.becameOurClient = becameOurClient;
        this.mass = mass;
    }

    public String toString() {
        return String.format("Name: %s %s%nDate of Birth: %s%nBecame of our client: %s%nClient parameters%n%s", firstName, lastName, dateOfBirth, becameOurClient, mass);
    }
}
