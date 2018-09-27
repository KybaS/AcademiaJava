package it_proger.copyier_reader_writer_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Secondary {

    void creatorFile(String pathName){
        try {
            File file = new File(pathName);

            if (!file.exists())
                file.createNewFile();

        }catch (IOException e){
            System.out.println("ERROR - " + e);
        }
    }

    void ownReader(String pathName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(pathName));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("ERROR " + e);
        }
    }

    void ownWriter(String pathName, String text) {
        try {
            File file = new File(pathName);

            if (!file.exists())
                file.createNewFile();

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(text);
            printWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR " + e);
        }
    }

    void ownCopyingData(String pathNameFromCopying, String pathNameTo) {

        BufferedReader bufferedReader = null;

        try {
            File file = new File(pathNameTo);
            File file1 = new File(pathNameFromCopying);
            PrintWriter printWriter = new PrintWriter(file);

            if (!file.exists())
                file.createNewFile();

            if (!file1.exists())
                file1.createNewFile();

            bufferedReader = new BufferedReader(new java.io.FileReader(file1));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line);
            }

            printWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR - " + e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("ERROR - " + e);
            }
        }
    }
}