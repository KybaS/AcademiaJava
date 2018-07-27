package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame {
    JLabel firstLabel;
    JButton firstButton;

    Window() {
        super("JFrame window");

        setLayout(new FlowLayout());

        firstLabel = new JLabel("This is JLabel ");
        firstButton = new JButton("Press me");

        add(firstLabel);
        add(firstButton);

        EventHandler eventHandler = new EventHandler();
        firstButton.addActionListener(eventHandler);
    }

    public class EventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String txt = firstLabel.getText();
            firstLabel.setText(txt + txt.length());

        }
    }

}
