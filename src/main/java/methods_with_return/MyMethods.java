package methods_with_return;

public class MyMethods {

    public static void main(String[] args) {

        String result = sayHelloTo("Anna");
        System.out.println(result);

        int sumRes = sum(2, 9);
        System.out.println(sumRes);
    }

    private static String sayHelloTo(String name){
        String sentences = "Hello " + name;
        return sentences;
    }

    private static int sum(int x, int y){
        int res = x * y;
        return res;
    }
}
