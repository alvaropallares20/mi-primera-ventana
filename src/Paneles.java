import javax.swing.*;
import java.awt.*;

public class Paneles {
    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setBounds(40, 80, 200, 200);
        panel.setBounds(40, 80, 200, 200);
    }
}
