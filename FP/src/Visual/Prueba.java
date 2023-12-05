package Visual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba extends JFrame {

    public Prueba() {
        setTitle("Ventana 1");
        setSize(300, 200);

        JButton boton = new JButton("Abrir Ventana 2");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual
                dispose();

                // Abrir una nueva ventana (en este caso, Ventana2)
                Ventana2 ventana2 = new Ventana2();
                ventana2.setVisible(true);
            }
        });

        getContentPane().add(boton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Prueba prueba = new Prueba();
                prueba.setVisible(true);
            }
        });
    }
}

class Ventana2 extends JFrame {

    public Ventana2() {
        setTitle("Ventana 2");
        setSize(300, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
