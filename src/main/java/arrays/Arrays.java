package arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = {5, 7, 100, -505, 0, -9};
        numbers[1] = 777;

        String[] summerMonths = {"June", "July", "August"};

        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);

        for (String summerMonth : summerMonths) {
            System.out.print(summerMonth + "\t" + "\n");
        }

        for (int number : numbers) {
            sumOfArray(number);
            recheckNumValue(number);
        }

    }

    public static void sumOfArray(int num) {
        int result = num * 2;
        System.out.print("x2 = " + result + "\t");
    }

    public static void recheckNumValue(int a) {
        if (a < 0) {
            System.out.println("x1 = " + a + " number has a negative value");
        } else if (a > 0){
            System.out.println("x1 =  " + a + " number has a positive value");
        } else if (a == 0){
            System.out.println("This is zero");
        } else {
            System.out.println("ERROR which will never to being");
        }
    }
}
