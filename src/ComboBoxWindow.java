import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxWindow {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setBackground(Color.white);

        JLabel selectedLabel = new JLabel("Lenguajes de programación: ");
        mainpanel.add(selectedLabel);

        JComboBox<String> caja = new JComboBox<>();
        caja.addItem("Java");
        caja.addItem("C++");
        caja.addItem("Python");
        caja.addItem("PHP");
        mainpanel.add(caja);

        JButton boton = new JButton("OK");
        boton.setBackground(Color.pink);
        mainpanel.add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = caja.getItemAt(caja.getSelectedIndex());
                selectedLabel.setText("El lenguaje de programación seleccionado: " + selected);
            }
        });
        f.repaint();
        f.revalidate();
        f.setContentPane(mainpanel);
    }
}
