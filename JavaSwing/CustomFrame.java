package JavaSwing;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {
    CustomFrame(){
//        this.setSize(600, 300);
        this.setTitle("Example One"); // set menu title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // will exit program on close
//        this.setResizable(false); // frame is not resizable
        this.getContentPane().setBackground(new Color(0x123456)); // background
        this.pack();
    }
}
