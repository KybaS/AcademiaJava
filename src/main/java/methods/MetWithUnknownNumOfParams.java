package methods;

public class MetWithUnknownNumOfParams {
    public static void main(String[] args) {

        System.out.println(calculatingAverageOfNum(23,34,54,344,43,3456,34534,34534,23,45,345,435.45,345.43));
        System.out.println(numOfPassedParams("test", "words", "what are you talking about?"));
    }

    public static double calculatingAverageOfNum(double...numbers){
        double sum = 0;
        for (double i: numbers)
            sum+=i;
        return sum/numbers.length;
    }

    public static String numOfPassedParams(String...words){
           int num = words.length;
        return String.valueOf(num);
    }
}
