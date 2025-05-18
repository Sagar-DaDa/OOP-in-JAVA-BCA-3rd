package unit_11;

import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    Label label;
    TextArea textArea;

    KeyListenerExample() {
        label = new Label();
        label.setBounds(20, 50, 200, 20);

        textArea = new TextArea();
        textArea.setBounds(20, 80, 300, 200);
        textArea.addKeyListener(this);  // Register key listener

        add(label);
        add(textArea);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}

