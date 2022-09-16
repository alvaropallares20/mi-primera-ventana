package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        JLabel label = new JLabel("Hola mundo");
        label.setForeground(Color.green);
        mainPanel.add(label);
        f.setContentPane(mainPanel);

    }
}
