package it_proger.copyier_reader_writer_txt;

import java.io.IOException;

public class Master {
    public static void main(String[] args) throws IOException {

        final String PATH_TO_TXT_FILE = "test.txt";
        final String PATH_FROM_TXT_FILE = "data.txt";

        Secondary secondary = new Secondary();

        secondary.ownWriter(PATH_TO_TXT_FILE, "HELLO WORLD");
        secondary.ownReader(PATH_TO_TXT_FILE);
        secondary.ownCopyingDataTXT(PATH_FROM_TXT_FILE, PATH_TO_TXT_FILE);
        secondary.ownReader(PATH_TO_TXT_FILE);
    }
}
