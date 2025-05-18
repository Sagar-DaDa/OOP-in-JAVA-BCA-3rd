package unit_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample extends JFrame {
    JLabel label;

    public MouseAdapterExample() {
        setTitle("Mouse Adapter Example");
        setSize(600, 300);
        setLayout(new FlowLayout());

        label = new JLabel("No event");
        add(label);

        // Add MouseAdapter to listen for mouse clicks
        addMouseListener(new MyAdapter(label));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Inner class extending MouseAdapter
    class MyAdapter extends MouseAdapter {
        JLabel label;

        MyAdapter(JLabel label) {
            this.label = label;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("Mouse is clicked at (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
