package composition;

public class Data {
    private int day;
    private int month;
    private int year;

    Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%s/%s/%s", day, month, year);
    }
}
