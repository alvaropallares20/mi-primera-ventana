import javax.swing.*;
import java.awt.*;

public class Paneles {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 2000, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setBackground(Color.pink);
        mainpanel.setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setBounds(0, 0, 100, 100);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.setBounds(200, 0, 100, 100);

        mainpanel.add(panel1);
        mainpanel.add(panel2);

        f.setContentPane(mainpanel);
        f.revalidate();
        f.repaint();


    }
}
