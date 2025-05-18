package unit_11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class MouseEventExample extends JFrame implements MouseListener {

    Label label1, label2, label3;

    MouseEventExample() {
        setLayout(new FlowLayout());

        label1 = new Label("No event");
        label2 = new Label("No event");
        label3 = new Label("No event");

        add(label1);
        add(label2);
        add(label3);

        addMouseListener(this);

        setTitle("MouseListener Example");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        label1.setText("Mouse pressed at: " + e.getX() + ", " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        label1.setText("Mouse released at: " + e.getX() + ", " + e.getY());
    }

    public void mouseClicked(MouseEvent e) {
        label3.setText("Mouse clicked at: " + e.getX() + ", " + e.getY() + " | Click count: " + e.getClickCount());
    }

    public void mouseEntered(MouseEvent e) {
        label2.setText("Mouse entered at: " + e.getX() + ", " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        label2.setText("Mouse exited at: " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}

