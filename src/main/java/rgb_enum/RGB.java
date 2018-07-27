package rgb_enum;

public class RGB {
    public static void main(String[] args) {

        for (Colors color : Colors.values()) {
            System.out.printf("%s %s%n", color, color.getRGB());
        }
    }
}
