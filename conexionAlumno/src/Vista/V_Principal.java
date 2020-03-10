package Vista;

import Controlador.Oyente_V_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class V_Principal {

    JFrame f = new JFrame();

    private JMenuBar jmb = new JMenuBar();
    private JMenu menu1;
    private JMenuItem miCrear, miAleatorio, miSalir;

    public JMenuItem getMiCrear() {
        return miCrear;
    }

    public JMenuItem getMiAleatorio() {
        return miAleatorio;
    }

    public JMenuItem getMiSalir() {
        return miSalir;
    }

    public V_Principal() {
        f.setTitle("Ventana Principal");
        f.setSize(500, 450);
        f.setLocation(200, 200);
        iniciarComponentes();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {

        f.setJMenuBar(jmb);
        menu1 = new JMenu("Alumnos");
        jmb.add(menu1);

        miCrear = new JMenuItem("Crear ALumnos");
        miCrear.addActionListener(new Oyente_V_Principal(this));
        menu1.add(miCrear);

        miAleatorio = new JMenuItem("Aleatorio ALumnos");
        miAleatorio.addActionListener(new Oyente_V_Principal(this));
        menu1.add(miAleatorio);

        miSalir = new JMenuItem("Salir");
        miSalir.addActionListener(new Oyente_V_Principal(this));
        menu1.add(miSalir);

    }

}
