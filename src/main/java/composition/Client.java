package composition;

public class Client {

    private String name;
    private Data dateOfBirth;

    public Client(String n, Data dn){
        this.name = n;
        this.dateOfBirth = dn;
    }

    public String toString(){
        return String.format("Name:%s%n Date of Birth: %s", name, dateOfBirth);
    }
}
