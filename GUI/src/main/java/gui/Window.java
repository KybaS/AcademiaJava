package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
        cancelButton.addMouseListener(new MyMouseListener());
    }

    public class EventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Hello");

//            String txt = firstLabel.getText();
//            firstLabel.setText(txt + txt.length());

//            if (e.getSource()==saveButton){
//                Calendar calendar = Calendar.getInstance();
//                firstLabel.setText("Save button was pressed - " + calendar.getTime());
//            }else if(e.getSource()==cancelButton){
//                firstLabel.setText("");
//            }
        }
    }

    public class MyMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            cancelButton.setBackground(Color.RED);
        }

        public void mouseEntered(MouseEvent e) {
            cancelButton.setBackground(Color.GREEN);
        }

        public void mousePressed(MouseEvent e) {
            cancelButton.setBackground(Color.ORANGE);
        }

        public void mouseReleased(MouseEvent e) {
            cancelButton.setBackground(Color.BLACK);
        }

        public void mouseExited(MouseEvent e) {
            cancelButton.setBackground(Color.WHITE);
        }

    }
}
