package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.Random;

class Window extends JFrame {

    int width = 500;
    int height = 500;
    private JButton cancelButton;

    Window() {
        super("JFrame window");
        setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setLayout(null);

        cancelButton = new JButton("Cancel");
        cancelButton.setLocation(25, 25);
        cancelButton.setSize(100, 40);
        panel.add(cancelButton);

        EventHandler eventHandler = new EventHandler();
        cancelButton.addActionListener(eventHandler);
        cancelButton.addMouseListener(new MyMouseListener());

        setContentPane(panel);
    }

    public class EventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar calendar = Calendar.getInstance();
            JOptionPane.showMessageDialog(null, calendar.getTime());
        }
    }

    public class MyMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            cancelButton.setBackground(Color.RED);
        }

        public void mouseEntered(MouseEvent e) {
            cancelButton.setBackground(Color.GREEN);
            Random r = new Random();
            cancelButton.setLocation(r.nextInt(width - 100), r.nextInt(height - 100));
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
