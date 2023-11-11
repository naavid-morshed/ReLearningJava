package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ExampleOne {
    public static void main(String[] args) {
        // create a custom JFrame
        CustomFrame customJFrame = new CustomFrame();

        // image icon
        ImageIcon imageIcon = new ImageIcon("./JavaSwing/logo.png");
        customJFrame.setIconImage(imageIcon.getImage());

        // creating button and it's size
        JButton jButtonOne = new JButton("Use Fingerprint");
//        jButtonOne.setBounds(226, 100, 120, 40);

        final JTextField jTextField = new JTextField();
        jTextField.setEditable(false);
        jTextField.setBounds(200, 50, 150, 20);
        jButtonOne.addActionListener((ActionEvent actionEvent) -> {
            System.out.println(actionEvent.getClass());
            jTextField.setText("You are Authorized");
        });

        customJFrame.add(jButtonOne);
        customJFrame.add(jTextField);
        customJFrame.setLayout(null);
        customJFrame.setVisible(true);
    }
}
