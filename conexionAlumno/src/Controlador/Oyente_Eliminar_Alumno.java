package Controlador;

import Modelo.Alumno_BD;
import Vista.V_CrearAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oyente_Eliminar_Alumno implements ActionListener {

    V_CrearAlumnos vca;
    Alumno_BD bd;

    public Oyente_Eliminar_Alumno(V_CrearAlumnos vca) {

        this.vca = vca;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //  bd.eliminar( vca.eliminarAlumno());
    }

}
