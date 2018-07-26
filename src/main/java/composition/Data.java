package composition;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public String toString(){
        return String.format("%s/%s/%s", day, month, year);
    }
}
