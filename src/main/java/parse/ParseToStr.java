package parse;

public class ParseToStr {
    public static void main(String[] args) {

        int someYear = Integer.parseInt("2048");
        final int ONE_HUNDRED = 100;
        int yearPlusOneHundred = someYear + ONE_HUNDRED;
        double firstDouble = 101.101;
        double myDouble = Double.parseDouble("34.98");
        int myInt = Integer.parseInt("2018");

        System.out.println(yearPlusOneHundred);
        String myStringD = String.valueOf(myDouble);
        String myStringI = String.valueOf(myInt);
        String parseFirstDouble = String.valueOf(firstDouble);

        System.out.println(myDouble + " : " + myStringD);
        System.out.println(myStringI + " : " + myInt);
        System.out.println(parseFirstDouble);
    }
}
