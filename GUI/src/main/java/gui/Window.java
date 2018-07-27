package gui;

import javax.swing.*;
import java.awt.*;

class Window extends JFrame {

    Window() {
        super("JFrame window");

        setLayout(new FlowLayout());

        JLabel firstLabel  = new JLabel("Hello in my label");
        JLabel secondLabel = new JLabel("Second label");
        add(firstLabel);
        add(secondLabel);
    }

}
