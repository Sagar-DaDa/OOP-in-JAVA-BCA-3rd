package unit_11;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class MDIExample extends JFrame {

    // JDesktopPane is the container for internal frames
    private final JDesktopPane desktopPane = new JDesktopPane();

    public MDIExample() {
        super("MDI Example");  // Set window title

        // Create first internal frame with all window decorations enabled
        JInternalFrame frame1 = new JInternalFrame("Frame 1", true, true, true, true);
        // Add simple label content to frame1
        frame1.getContentPane().add(new JLabel("Frame 1 contents..."));
        frame1.pack();             // Size the frame to fit its contents
        frame1.setVisible(true);   // Make frame visible

        // Create second internal frame with the same capabilities
        JInternalFrame frame2 = new JInternalFrame("Frame 2", true, true, true, true);
        frame2.getContentPane().add(new JLabel("Frame 2 contents..."));
        frame2.pack();

        // Position frame2 to the right of frame1 with a gap of 10 pixels
        int x2 = frame1.getX() + frame1.getWidth() + 10;
        int y2 = frame1.getY();
        frame2.setLocation(x2, y2);
        frame2.setVisible(true);

        // Add both internal frames to the desktop pane
        desktopPane.add(frame1);
        desktopPane.add(frame2);

        // Add desktop pane to the main JFrame in the center position
        this.add(desktopPane, BorderLayout.CENTER);

        // Set minimum window size and close operation
        this.setMinimumSize(new Dimension(400, 300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        try {
            // Use the system look and feel for native appearance
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Run GUI code on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            MDIExample frame = new MDIExample();
            frame.pack();  // Adjust frame size based on components
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize window on start
            frame.setVisible(true); // Show the frame
        });
    }
}
