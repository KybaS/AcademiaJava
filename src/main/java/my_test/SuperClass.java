package my_test;

import java.util.ArrayList;

public class SuperClass extends SubClass{
    public static void main(String[] args) {

        SubClass subClass = new SubClass();

        subClass.numbersRand(1000, 0, 100, 200.78, 300, 400, 500, 600, 700, 800, 900, 1000, 1100);
        subClass.stringsRand("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        ArrayList myStrings = new ArrayList(5);
        myStrings.add(0, "arrayZero");
        myStrings.add(1, "arrayOne");
        myStrings.add(2, "arrayTwo");
        myStrings.add(3, "array3");
        myStrings.add(4, "array4");
        myStrings.add(5, "array5");
        myStrings.add(6, "array6");
        myStrings.add(7, "array7");
        myStrings.add(8, "array8");
        myStrings.add(9, "array9");
        myStrings.add(10, "array10");
        myStrings.add(11, "array11");

        int size = myStrings.size();
        String res = myStrings.get(2).toString();
        System.out.println(res + " " + size);


        int count = 0;
        for (int i = 0; i < 5; i++){
           String result = myStrings.get(subClass.random_number).toString();
           subClass.random_number = subClass.random_number + count;
           count++;
            System.out.println(result + "  " + count);





        }
    }
}
