package composition;

public class Composition {
    public static void main(String[] args) {

        Data dayOfBirth = new Data(9, 4, 1988);
        Data becameOurClient = new Data(15, 8, 2004);
        MassIndex mass = new MassIndex(178, 78, 30);
        Client firstClient = new Client("John", "Lennon", dayOfBirth, becameOurClient, mass);

        System.out.printf("%s", firstClient);
        mass.indexOfMass(170, 75, 15);
    }
}
