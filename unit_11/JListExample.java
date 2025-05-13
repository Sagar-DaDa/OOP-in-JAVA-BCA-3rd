package unit_11;

import javax.swing.*;

public class JListExample extends JFrame {
    public JListExample() {
        // Create a panel to hold components
        JPanel panel = new JPanel();

        // Label to describe the list
        JLabel label = new JLabel("Select the day of the week:");

        // Array of week days
        String[] week = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        // Create the JList with the week array
        JList<String> list = new JList<>(week);

        // Set a default selected index
        list.setSelectedIndex(2); // Wednesday

        // Add components to the panel
        panel.add(label);
        panel.add(list);

        // Add panel to the frame
        add(panel);

        // Frame settings
        setTitle("JList Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListExample();
    }
}

