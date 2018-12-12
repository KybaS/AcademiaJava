package arrays.Shapes;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            myMap.put(i, "Test_" + i);
        }

        String output = myMap.toString();
        String value = myMap.get(5);

        System.out.println(value);
        System.out.println(output);
        System.out.println(myMap.size());
    }
}
