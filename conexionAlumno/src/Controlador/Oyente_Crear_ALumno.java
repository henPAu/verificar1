package Controlador;

import Modelo.Alumno_BD;
import Modelo.Alumno;
import Vista.V_CrearAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oyente_Crear_ALumno implements ActionListener {

    V_CrearAlumnos vca;
    //Alumno_BD bd;
    //Alumno a;

    public Oyente_Crear_ALumno(V_CrearAlumnos v) {
        this.vca = v;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //de la vista recibo un alumno
        //a=vca.guardarAlumno();
        //en la base de datos se envia  los datos de alumno a guardar
        //bd.guardarAlumnoBD(a);
        //envio en la venta a limpiar los campos
        //vca.limpiarCampos();
        vca.bloquear();
        //  System.out.println("objeto: "+vca.getName());
    }
}
