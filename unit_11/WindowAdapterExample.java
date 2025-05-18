package unit_11;

import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample {
    Frame f;

    public WindowAdapterExample() {
        f = new Frame("Window Adapter Example");

        // Use WindowAdapter to override only windowClosing()
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowAdapterExample();
    }
}

