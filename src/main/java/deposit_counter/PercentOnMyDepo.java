package deposit_counter;

public class PercentOnMyDepo {
    public static void main(String[] args) {
        double deposit = 2600, percent = 0.11, balance = 0;
        int yearOfDepo = 2018;
        for (int year = yearOfDepo; year <= (yearOfDepo + 10); year++) {
            balance = deposit * Math.pow(1 + percent, (year - yearOfDepo + 1));
            System.out.println("Balance on the end of deposit is " + balance + " for the " + year);
        }
    }
}
