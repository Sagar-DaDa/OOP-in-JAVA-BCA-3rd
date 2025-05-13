package unit_11;

import javax.swing.*;
import java.awt.*;

public class JTextFieldExample extends JFrame {
    public JTextFieldExample() {
        // Create a JTextField with 20 columns
        JTextField jtf = new JTextField(20);

        // Add the text field to the frame
        add(jtf);

        // Set layout and frame properties
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextFieldExample();
    }
}
