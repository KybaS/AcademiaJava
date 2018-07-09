package methods_with_return;

/**
 * test comments
 * methods with return
 */
public class MyMethodsWithReturn {

    public static void main(String[] args) {

        String result = sayHelloTo("Anna");
        System.out.println(result);

        int sumRes = sum(2, 9);
        System.out.println(sumRes);
    }

    private static String sayHelloTo(String name) {
        String sentences = "Hello " + name;
        return sentences;
    }

    /**
     * test comments
     *
     * @param x first number multiply to
     * @param y second number
     * @return result multiply x * y
     */
    private static int sum(int x, int y) {
        int res = x * y;
        return res;
    }
}
