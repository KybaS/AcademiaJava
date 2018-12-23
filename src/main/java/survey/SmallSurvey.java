package survey;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class SmallSurvey {

    private static final String PATH = "log.txt";

    public static void main(String[] args) throws IOException {

        DataSurvey dataSurvey = new DataSurvey();
        Date date = new Date();

        while (true) {
            System.out.println(date.toString());
            fileWriter(PATH, "***********************************");

            Scanner scan = new Scanner(System.in);
            System.out.println("Type your name: ");
            String name = scan.nextLine();
            System.out.println("Type your age: ");
            int age = scan.nextInt();

            dataSurvey.setName(name);
            dataSurvey.setAge(age);
            String yourName = dataSurvey.getName();
            int yourAge = dataSurvey.getAge();
            int born = getCurrentYear() - yourAge;

            String text1 = "Your name is " + "[" + yourName + "]" + " and your age is " + yourAge;
            System.out.println(text1);
            fileWriter(PATH, text1);

            String text2 = "Approximate year of your birth is " + born;
            System.out.println(text2);
            fileWriter(PATH, text2);

            File check = new File(PATH);
            fileWriter(PATH, "File value - " + check.length() + " bytes");
            fileWriter(PATH, date.toString());
            fileWriter(PATH, "space " + check.toURI());

            if (yourAge < 40) {
                State state = State.YOUNG;
                System.out.println("You are " + state);
            } else {
                State state = State.OLD;
                System.out.println("You are " + state);
            }
        }
    }

    enum State {
        YOUNG,
        OLD
    }

    private static int getCurrentYear() {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }

    private static void fileWriter(String path, String text) throws IOException {
        File file = new File(path);
        if (!file.exists())
            file.createNewFile();
        PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
        printWriter.write(text + "\r\n");
        printWriter.close();
    }
}
