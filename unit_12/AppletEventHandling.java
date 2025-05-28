package unit_12;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class AppletEventHandling extends Applet implements MouseListener {
    StringBuffer strBuffer;

    public void init() {
        addMouseListener(this);
        strBuffer = new StringBuffer();
        addItem("Initializing the applet");
        addItem("Welcome to Applet");
    }

    public void start() {
        addItem("Starting the applet");
    }

    public void stop() {
        addItem("Stopping the applet");
    }

    public void destroy() {
        addItem("Destroying the applet");
        addItem("Good Bye!!");
    }

    void addItem(String word) {
        System.out.println(word);
        strBuffer.append(word + "\n");
        repaint();
    }

    public void paint(Graphics g) {
        setForeground(Color.white);
        setBackground(Color.black);
        g.drawString(strBuffer.toString(), 10, 20);
    }

    public void mouseEntered(MouseEvent event) {
        addItem("Mouse is Entered!!");
    }

    public void mouseExited(MouseEvent event) {
        addItem("Mouse is Exited!!");
    }

    public void mousePressed(MouseEvent event) {
        addItem("Mouse is Pressed!!");
    }

    public void mouseReleased(MouseEvent event) {
        addItem("Mouse is Released!!");
    }

    public void mouseClicked(MouseEvent event) {
        addItem("Mouse is Clicked!!");
    }
}

