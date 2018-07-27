package composition;

public class Client {

    private String firstName;
    private String lastName;
    private Data dateOfBirth;
    private Data becameOurClient;

    Client(String firstName, String lastName, Data dayOfBirth, Data becameOurClient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dayOfBirth;
        this.becameOurClient = becameOurClient;
    }

    public String toString() {
        return String.format("Name: %s %s%nDate of Birth: %s%nBecame our client: %s", firstName, lastName, dateOfBirth, becameOurClient);
    }
}
