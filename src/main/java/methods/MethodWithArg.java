package methods;

public class MethodWithArg {
    public static void main(String[] args) {

        int a = 1, b = 5;
        int result = processedData(a, b);
        System.out.println(result);
        System.out.println("a = " + a + "; b = " + b);

        int[] numArray = {1, 2, 3};

        processedData(numArray);
        for (int i:numArray)
            System.out.print(i + " ");
    }

    public static int processedData(int n1, int n2) {
        n1 = n1 * 10;
        n2 = n2 * 100;
        return n1 + n2;
    }

    public static void processedData(int[] m) {
        for (int index = 0; index < m.length; index++)
            m[index] = m[index] + 1;
    }
}
