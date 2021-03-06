package methods;

public class MetWithUnknownNumOfParams {

    private static double sum = 0;

    public static void main(String[] args) {

        System.out.println(calculatingAverageOfNum(23, 34, 54, 344, 43, 3456, 34534, 34534, 23, 45, 345, 435.45, 345.43));
        System.out.println(numOfPassedParams("test", "words", "what are you talking about?"));
        printListOfNumbers(45, 23, 234, 34, 4554, 34, 32, 2, 21, 103, 545);
    }

    private static double calculatingAverageOfNum(double... numbers) {
        for (double i : numbers)
            sum += i;
        return sum / numbers.length;
    }

    private static String numOfPassedParams(String... words) {
        int num = words.length;
        return String.valueOf(num);
    }

    private static void printListOfNumbers(int... ints) {
        for (int numbers : ints)
            System.out.print(numbers + "\t");
    }
}
