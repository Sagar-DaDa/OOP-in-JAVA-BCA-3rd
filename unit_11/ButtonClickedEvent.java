package unit_11;

import javax.swing.*;
import java.awt.event.*;

class ButtonClickedEvent extends JFrame implements ActionListener {
    private int count = 0;
    JLabel label;
    JButton button;

    ButtonClickedEvent() {
        label = new JLabel("Button clicked 0 times");
        button = new JButton("Click Me");

        button.addActionListener(this);  // Register listener

        setLayout(new java.awt.FlowLayout());
        add(label);
        add(button);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Button clicked " + count + " times");
    }

    public static void main(String[] args) {
        new ButtonClickedEvent();
    }
}

