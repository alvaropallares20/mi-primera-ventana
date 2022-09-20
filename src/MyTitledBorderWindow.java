import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyTitledBorderWindow {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 2000, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setBackground(Color.blue);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.white);
        panel1.setBounds(40, 20, 500, 200);
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black, 5, true), "search"));
        mainpanel.add(panel1);


        JRadioButton boton1 = new JRadioButton("By name");
        JRadioButton boton2 = new JRadioButton("By Id");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(boton1);
        grupo.add(boton2);
        panel1.add(boton1);
        panel1.add(boton2);

        mainpanel.setLayout(null);
        f.setContentPane(mainpanel);
        f.revalidate();
        f.repaint();

    }
}
