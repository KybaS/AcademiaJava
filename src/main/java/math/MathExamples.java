package math;

public class MathExamples {
    public static void main(String[] args) {

        double less_number = -12.23;
        double great_number = 248.09;
        double random_number = great_number + (Math.random() * less_number);

        System.out.println("Ceil - " + Math.ceil(less_number) + " Floor - " + Math.floor(less_number));
        System.out.println("Max - " + Math.max(less_number, great_number) + " Min - " + Math.min(less_number, great_number));
        System.out.println(Math.pow(5, 4)); //some number to the power of some number
        System.out.println(Math.sqrt(100)); //square root of the number
        System.out.println(Math.abs(random_number));
    }
}
