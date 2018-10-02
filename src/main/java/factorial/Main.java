package factorial;

public class Main {
    public static void main(String[] args) {

        Factorial factorial = new Factorial();
        factorial.testFactorial();

        int number = 8;
        System.out.println("Factorial from number " + number + " = " + Factorial.factorial(number));
    }
}
