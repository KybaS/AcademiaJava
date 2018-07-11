package arrays;

import java.util.Scanner;

public class ArrayToTable {
    public static void main(String[] args) {

        int[] olympicGames = {1896, 1900, 1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1994, 1996, 1998, 2000, 2002, 2004, 2006, 2008, 2010, 2012, 2014, 2016, 2018, 2020, 2024};
        String[] countries = {"Greece", "France", "United States", "United Kingdom", "Sweden", "Germany", "Belgium", "France", "France", "Switzerland", "Netherlands", "United States", "United States", " Nazi Germany", " Nazi Germany", "Empire of Japan/Nazi Germany", "Empire of Japan/Finland", "Italy", "United Kingdom", "Switzerland", "United Kingdom", "Norway", "Finland", "Italy", "Australia/Sweden", "United States", "Italy", "Austria", "Japan", "France", "Mexico", "Japan", "West Germany", "Austria", "Canada", "United States", "Soviet Union", "Yugoslavia", "United States", "Canada", "South Korea", "France", "Spain", "Norway", "United States", "Japan", "Australia", "United States", "Greece", "Italy", "China", "Canada", "United Kingdom", "Russia", "Brazil", "South Korea", "Japan", "China", "France"};
        String[] cities = {"Athens", "Paris", "St. Louis", "London", "Stockholm", "Berlin", "Antwerp", "Chamonix", "Paris", "St. Moritz", "Amsterdam", "Lake Placid", "Los Angeles", "Garmisch-Partenkirchen", "Berlin", "Sapporo/Garmisch-Partenkirchen", "Tokyo/Helsinki", "Cortina d'Ampezzo", "London", "St. Moritz", "London", "Oslo", "Helsinki", "Cortina d'Ampezzo", "Melbourne/Stockholm", "Squaw Valley", "Rome", "Innsbruck", "Tokyo", "Grenoble", "Mexico City", "Sapporo", "Munich", "Innsbruck", "Montreal", "Lake Placid", "Moscow", "Sarajevo", "Los Angeles", "Calgary", "Seoul", "Albertville", "Barcelona", "Lillehammer", "Atlanta", "Nagano", "Sydney", "Salt Lake City", "Athens", "Turin", "Beijing", "Vancouver", "London", "Sochi", "Rio de Janeiro", "Pyeongchang", "Tokyo", "Beijing", "Paris"};

//        System.out.println("Index\tYear\tCountry and City");
//        for (int i=0; i<olympicGames.length; i++){
//            System.out.print(i+"\t");
//            System.out.print(olympicGames[i]+"\t");
//            System.out.print(countries[i]+ " - " + cities[i]+"\n");
//        }
        System.out.println("Enter year: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        scan.close();

        boolean found = false;
        System.out.println("Index\tYear\tCountry and City");

        for (int j=0; j<olympicGames.length; j++){
            if (olympicGames[j]==year){
                System.out.print(j+"\t");
                System.out.print(olympicGames[j]+"\t");
                System.out.print(countries[j]+ " - " + cities[j] +"\n");
                found=true;
            }
        }
        if (!found){
            System.out.println("In this year Olympic Games did not occur");
        }
    }
}
