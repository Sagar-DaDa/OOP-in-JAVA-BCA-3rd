package unit_11;

import javax.swing.*;

public class JTableExample {
    JFrame frame;
    JTable table;

    JTableExample() {
        frame = new JFrame("JTable Example");

        String[][] data = {
            {"Sumit Bhujel", "100", "BCA"},
            {"Srinkhala Dhakal", "101", "IT"}
        };

        String[] columns = { "Name", "Roll No", "Department" };

        table = new JTable(data, columns);
        JScrollPane sp = new JScrollPane(table);

        frame.add(sp);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableExample();
    }
}

