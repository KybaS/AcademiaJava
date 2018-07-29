package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

class Window extends JFrame {
    private JLabel firstLabel;
    private JButton saveButton;
    private JButton cancelButton;

    Window() {
        super("JFrame window");

        setLayout(new FlowLayout());

        firstLabel = new JLabel("This is JLabel ");
        saveButton = new JButton("Save");
        cancelButton = new JButton("Cancel");

        add(firstLabel);
        add(saveButton);
        add(cancelButton);

        EventHandler eventHandler = new EventHandler();
        saveButton.addActionListener(eventHandler);
        cancelButton.addActionListener(eventHandler);
    }

    public class EventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
          //  String txt = firstLabel.getText();
          //  firstLabel.setText(txt + txt.length());

            if (e.getSource()==saveButton){
                Calendar calendar = Calendar.getInstance();
                firstLabel.setText("Save button was pressed - " + calendar.getTime());
            }else if(e.getSource()==cancelButton){
                firstLabel.setText("");
            }
        }
    }

}
