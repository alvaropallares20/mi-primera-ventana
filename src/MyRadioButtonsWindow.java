import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButtonsWindow {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainpanel = new JPanel();
        mainpanel.setBackground(Color.white);

        JRadioButton boton1 = new JRadioButton("Linux");
        boton1.setActionCommand("Linux");
        JRadioButton boton2 = new JRadioButton("Windows");
        boton2.setActionCommand("Windows");
        JRadioButton boton3 = new JRadioButton("Macintosh");
        boton3.setActionCommand("Macintosh");
        JButton boton = new JButton("Ok");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(boton1);
        grupo.add(boton2);
        grupo.add(boton3);
        mainpanel.add(boton1);
        mainpanel.add(boton2);
        mainpanel.add(boton3);
        mainpanel.add(boton);

        JLabel imagen = new JLabel();
        imagen.setIcon(new ImageIcon("Linux.jpeg"));
        mainpanel.add(imagen);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String selected = grupo.getSelection().getActionCommand();
                JOptionPane.showMessageDialog(f, "Ha seleccionado " + selected);
                imagen.setIcon(new ImageIcon(selected + ".jpeg"));
            }
        });

        f.repaint();
        f.revalidate();
        f.setContentPane(mainpanel);
    }
}
