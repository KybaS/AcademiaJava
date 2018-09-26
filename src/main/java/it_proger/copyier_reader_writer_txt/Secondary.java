package it_proger.copyier_reader_writer_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Secondary {

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

    void ownCopyingDataTXT(String pathNameFromCopying, String pathNameTo) throws IOException {

        File file = new File(pathNameTo);
        PrintWriter printWriter = new PrintWriter(file);

        if (!file.exists())
            file.createNewFile();

        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(pathNameFromCopying));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            printWriter.println(line);
        }

        printWriter.close();
        bufferedReader.close();
    }
}
