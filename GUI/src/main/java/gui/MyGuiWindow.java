package gui;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MyGuiWindow {
    public static void main(String[] args) {

        Window window = new Window();
        window.setLocationRelativeTo(null);
        window.setSize(600, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
