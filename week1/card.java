import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class card {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ID Card Generator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            // Add components for ID card details (name, photo, etc.)

            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
