package arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = {5, 7, 100, 505};
        numbers[1] = 777;

        String[] summerMonths = {"June", "July", "August"};

        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

        for (String summerMonth : summerMonths) {
            System.out.print(summerMonth + " / ");
        }
    }
}
