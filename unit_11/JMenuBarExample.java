package unit_11;

import javax.swing.*;
import java.awt.event.*;

public class JMenuBarExample extends JFrame implements ActionListener {

    // Components
    static JMenuBar menuBar;
    static JMenu menu, submenu;
    static JMenuItem item1, item2, item3, subItem1, subItem2;
    static JLabel label;

    public JMenuBarExample() {
        // Frame settings
        setTitle("Menu Demo");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize label
        label = new JLabel("No task");
        label.setBounds(50, 100, 300, 30);

        // Create menu bar and menus
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Submenu");

        // Menu items
        item1 = new JMenuItem("MenuItem1");
        item2 = new JMenuItem("MenuItem2");
        item3 = new JMenuItem("MenuItem3");
        subItem1 = new JMenuItem("SubMenuItem1");
        subItem2 = new JMenuItem("SubMenuItem2");

        // Add action listeners
        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        subItem1.addActionListener(this);
        subItem2.addActionListener(this);

        // Add items to menus
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        submenu.add(subItem1);
        submenu.add(subItem2);
        menu.add(submenu); // Add submenu to main menu

        // Add menu to menu bar
        menuBar.add(menu);

        // Add components to frame
        setJMenuBar(menuBar);
        add(label);

        setVisible(true);
    }

    // Handle menu item actions
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        label.setText(command + " selected");
    }

    public static void main(String[] args) {
        new JMenuBarExample();
    }
}

