package unit_12;

import java.applet.Applet;
import java.awt.Graphics;

public class SimpleAppletExample extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World!", 150, 150);
    }
}

