package unit_11;

import javax.swing.*;
import java.awt.event.*;

public class EventHandlingExample extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    public EventHandlingExample() {
        button = new JButton("Click Me");
        label = new JLabel("Waiting for click...");
        
        button.addActionListener(this); // Registering the event listener
        
        add(button);
        add(label);
        
        setLayout(new java.awt.FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Event handler method
    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new EventHandlingExample();
    }
}

