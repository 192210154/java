import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IDCardGeneratorWithImage extends JFrame {

    public IDCardGeneratorWithImage() {
        setTitle("ID Card Generator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new GridLayout(5, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTextField = new JTextField();

        JLabel idLabel = new JLabel("ID:");
        JTextField idTextField = new JTextField();

        JLabel departmentLabel = new JLabel("Department:");
        JTextField departmentTextField = new JTextField();

        JLabel imageLabel = new JLabel("Image URL:");
        JTextField imageTextField = new JTextField();

        JButton generateButton = new JButton("Generate ID Card");
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String id = idTextField.getText();
                String department = departmentTextField.getText();
                String imageUrl = imageTextField.getText();
                displayIDCard(name, id, department, imageUrl);
            }
        });

        cardPanel.add(nameLabel);
        cardPanel.add(nameTextField);
        cardPanel.add(idLabel);
        cardPanel.add(idTextField);
        cardPanel.add(departmentLabel);
        cardPanel.add(departmentTextField);
        cardPanel.add(imageLabel);
        cardPanel.add(imageTextField);
        cardPanel.add(generateButton);

        add(cardPanel);
    }

    private void displayIDCard(String name, String id, String department, String imageUrl) {
        JFrame idCardFrame = new JFrame("ID Card");
        idCardFrame.setSize(400, 300);
        idCardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        idCardFrame.setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Name: " + name);
        JLabel idLabel = new JLabel("ID: " + id);
        JLabel departmentLabel = new JLabel("Department: " + department);

        try {
            ImageIcon imageIcon = new ImageIcon(new java.net.URL(imageUrl));
            Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(image);
            JLabel imageDisplay = new JLabel(imageIcon);

            idCardFrame.add(imageDisplay, BorderLayout.WEST);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(3, 1));
        infoPanel.add(nameLabel);
        infoPanel.add(idLabel);
        infoPanel.add(departmentLabel);

        idCardFrame.add(infoPanel, BorderLayout.CENTER);

        idCardFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                IDCardGeneratorWithImage idCardGenerator = new IDCardGeneratorWithImage();
                idCardGenerator.setVisible(true);
            }
        });
    }
}
