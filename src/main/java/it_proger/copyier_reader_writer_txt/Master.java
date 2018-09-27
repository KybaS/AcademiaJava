package it_proger.copyier_reader_writer_txt;

public class Master {
    public static void main(String[] args) {

        final String PATH_TO_TXT_FILE = "test.txt";
        final String PATH_FROM_TXT_FILE = "data.txt";

        Secondary secondary = new Secondary();

        secondary.creatorFile("KYBA.html");
        secondary.ownWriter("KYBA.html", "<html>" +
                "<head>KSV</head>" +
                "<body>" +
                "<div>" +
                "<marquee>HELLO WORLD</marquee>" +
                "</div>" +
                "</body>" +
                "</html>");
        secondary.ownReader("KYBA.html");
        System.out.println("--------------------------------------------------");
        secondary.ownWriter(PATH_TO_TXT_FILE, "HELLO WORLD");
        secondary.ownReader(PATH_TO_TXT_FILE);
        secondary.ownCopyingData(PATH_FROM_TXT_FILE, PATH_TO_TXT_FILE);
        secondary.ownReader(PATH_TO_TXT_FILE);
    }
}
