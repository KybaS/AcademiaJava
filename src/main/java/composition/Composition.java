package composition;

public class Composition {
    public static void main(String[] args) {

        Data dn = new Data(9, 4, 1988);
        Client firstClient = new Client("John", dn);
        System.out.printf("%s", firstClient);
    }
}
