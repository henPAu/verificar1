package Controlador;

import Vista.V_AleatorioAlumnos;
import Vista.V_CrearAlumnos;
import Vista.V_Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oyente_V_Principal implements ActionListener {

    V_Principal vp;

    public Oyente_V_Principal(V_Principal vp) {
        this.vp = vp;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vp.getMiSalir()) {
            System.exit(0);

        }
        if (e.getSource() == vp.getMiAleatorio()) {
            new V_AleatorioAlumnos();

        }
        if (e.getSource() == vp.getMiCrear()) {
            new V_CrearAlumnos();

        }

    }

}
