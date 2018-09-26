package it_proger;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReader {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;

        try {
            File file = new File("To.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter printWriter = new PrintWriter(file);
            bufferedReader = new BufferedReader(new java.io.FileReader("From.txt"));

            String line;
            while ((line = bufferedReader.readLine()) != null){
                printWriter.println(line);
            }
            printWriter.close();

        }catch (IOException e){
            System.out.println("ERROR " + e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
