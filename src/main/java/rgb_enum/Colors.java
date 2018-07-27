package rgb_enum;

public enum Colors {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);

    private int red, green, blue;

    Colors(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getRGB() {
        return String.format("(%s,%s,%s)", red, green, blue);
    }
}
