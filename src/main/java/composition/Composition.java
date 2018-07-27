package composition;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class Composition {
    public static void main(String[] args) {

        Data dayOfBirth = new Data(9, 4, 1988);
        Data becameOurClient = new Data(15, 8, 2004);
        MassIndex mass = new MassIndex(178, 78, 30);
        Client firstClient = new Client("John", "Lennon", dayOfBirth, becameOurClient, mass);

        System.out.printf("%s", firstClient);
        mass.indexOfMass(170, 70, 35);

        System.out.println("Result of  the method getCurrentSeason - " + getCurrentSeason());

        switch (getCurrentSeason()) {
            case WINTER:
                System.out.println("You should dress warmer");
                break;
            case SPRING:
                System.out.println("You should enjoy the spring");
                break;
            case SUMMER:
                System.out.println("You should spend more time in the water, because of the " + Seasons.SUMMER + " is too hot as always");
                break;
            case AUTUMN:
                System.out.println("It's time to drink more tea");
                break;
            default:
            case UNKNOWN:
                System.out.println("Unknown data");
                break;
        }
    }

    private static Seasons getCurrentSeason() {

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Current date: " + now);
        int m = now.getMonthValue();
        Month month = now.getMonth();
        int dayOfYear = now.getDayOfYear();
        int currentYear = now.getYear();
        int currentHour = now.getHour();
        DayOfWeek dayOfWeek = now.getDayOfWeek();

        System.out.println("Current number of month: " + m);
        System.out.println("Current month name is " + month);
        System.out.println("Day of the year is " + dayOfYear + " and the current year is " + currentYear);
        System.out.println("Current time is " + currentHour + " and day of the week is " + dayOfWeek);

        switch (m) {
            case 1:
            case 2:
            case 12:
                return Seasons.WINTER;
            case 3:
            case 4:
            case 5:
                return Seasons.SPRING;
            case 6:
            case 7:
            case 8:
                return Seasons.SUMMER;
            case 9:
            case 10:
            case 11:
                return Seasons.AUTUMN;
            default:
                return Seasons.UNKNOWN;
        }
    }
}
