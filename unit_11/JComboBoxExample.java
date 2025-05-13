package unit_11;

import javax.swing.*;
import java.awt.*;

public class JComboBoxExample extends JFrame {
    public JComboBoxExample() {
        // Array of items for the combo box
        String name[] = { "BBA", "BCA", "BIM", "BHM" };

        // Create combo box with array
        JComboBox<String> jc = new JComboBox<>(name);

        // Add combo box to frame
        add(jc);

        // Frame settings
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBoxExample();
    }
}

