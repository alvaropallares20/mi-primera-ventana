import javax.swing.*;

public class Formulario {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setBounds(10, 10, 200, 300);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Usuario: ");
        panel.add(label);
        j.setContentPane(panel);
        JTextField texto = new JTextField(16);
        panel.add(texto);
        JButton boton = new JButton("Aceptar");
        panel.add(boton);

        j.repaint();
        j.revalidate();

    }
}
