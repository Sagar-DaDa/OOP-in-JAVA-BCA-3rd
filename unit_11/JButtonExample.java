package unit_11;

import javax.swing.*;
import java.awt.*;

public class JButtonExample extends JFrame {
    public JButtonExample() {
        // Create buttons
        JButton bt1 = new JButton("Yes");
        JButton bt2 = new JButton("No");

        // Set layout and add buttons
        setLayout(new FlowLayout());
        add(bt1);
        add(bt2);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonExample();
    }
}

