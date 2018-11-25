package prometeus;

public class SquareRootMethod {

    public void squareRoot(double a, double b, double c) {

        double x1, x2;

        if (a != 0) {
            double D = b * b - 4 * a * c;

            if (D > 0) {
                x1 = (-b + Math.sqrt(D)) / (2 * a);
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else if (D < 0) {
                System.out.println("x1=");
                System.out.println("x2=");
            } else {
                x1 = x2 = -b / (2 * a);
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            }

        } else if (a == 0 & c == 0 & b != 0) {
            x1 = x2 = 0;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (b == 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        } else if (c == 0) {
            x1 = 0;
            x2 = -b / 2;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (b == 0 & c == 0) {
            x1 = x2 = 0;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (b == 0 & -c / a >= 0) {
            x1 = Math.sqrt(-c / a);
            x2 = -Math.sqrt(-c / a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (b == 0 & -c / a < 0) {
            System.out.println("x1=");
            System.out.println("x2=");
        }
    }
}
