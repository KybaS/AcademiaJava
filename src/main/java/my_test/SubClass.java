package my_test;

public class SubClass {

    private int a = 0, b = 11;
    int random_number = a + (int) (Math.random() * b);

    private double plus(double z, double... x){
        return z + x[random_number];
    }

    protected void numbersRand(double z, double... x){
        double res = plus(z, x);
        System.out.println(res);
    }

     String[] generatorStrings(String... strings){
        return strings;
    }

    protected void stringsRand(String... strings){
        String[] result = generatorStrings(strings);
        System.out.println(result[random_number]);
    }




}
