package unit_11;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JListWithItemListener extends JFrame implements ListSelectionListener {

    // Declare components
    JList<String> dateList, monthList, yearList;
    JLabel resultLabel;

    public JListWithItemListener() {
        // Frame setup
        setTitle("Birthday Selector");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Label
        JLabel prompt = new JLabel("Select your birthday:");

        // Create month, date, year arrays
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        String[] dates = new String[31];
        String[] years = new String[31];

        for (int i = 0; i < 31; i++) {
            dates[i] = String.valueOf(i + 1);
            years[i] = String.valueOf(2024 - i); // Change year range as needed
        }

        // Create lists
        dateList = new JList<>(dates);
        monthList = new JList<>(months);
        yearList = new JList<>(years);

        // Set default selections
        dateList.setSelectedIndex(0);
        monthList.setSelectedIndex(0);
        yearList.setSelectedIndex(0);

        // Add selection listeners
        dateList.addListSelectionListener(this);
        monthList.addListSelectionListener(this);
        yearList.addListSelectionListener(this);

        // Result label
        resultLabel = new JLabel(getBirthdayText());

        // Add components to frame
        add(prompt);
        add(dateList);
        add(monthList);
        add(yearList);
        add(resultLabel);

        setVisible(true);
    }

    // Get formatted birthday text
    private String getBirthdayText() {
        String date = dateList.getSelectedValue();
        String month = monthList.getSelectedValue();
        String year = yearList.getSelectedValue();
        return "Selected Birthday: " + date + " " + month + ", " + year;
    }

    // Handle list selection changes
    public void valueChanged(ListSelectionEvent e) {
        resultLabel.setText(getBirthdayText());
    }

    public static void main(String[] args) {
        new JListWithItemListener();
    }
}

