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
    private JButton pressMe;

    Window() {
        super("JFrame window");
        setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setLayout(null);

        pressMe = new JButton("Click me");
        pressMe.setLocation(25, 25);
        pressMe.setSize(100, 40);
        panel.add(pressMe);

        EventHandler eventHandler = new EventHandler();
        pressMe.addActionListener(eventHandler);
        pressMe.addMouseListener(new MyMouseListener());

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
            pressMe.setBackground(Color.RED);
        }

        public void mouseEntered(MouseEvent e) {
            pressMe.setBackground(Color.GREEN);
            Random r = new Random();
            pressMe.setLocation(r.nextInt(width - 100), r.nextInt(height - 100));
        }

        public void mousePressed(MouseEvent e) {
            pressMe.setBackground(Color.ORANGE);
        }

        public void mouseReleased(MouseEvent e) {
            pressMe.setBackground(Color.BLACK);
        }

        public void mouseExited(MouseEvent e) {
            pressMe.setBackground(Color.WHITE);
        }

    }
}
