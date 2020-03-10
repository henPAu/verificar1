package Controlador;

import Modelo.Alumno;
import Modelo.Alumno_BD;
import Vista.V_CrearAlumnos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oyente_Verificar_Alumno implements ActionListener {

    V_CrearAlumnos vca;
    //Alumno_BD bd;
    //Alumno a;

    public Oyente_Verificar_Alumno(V_CrearAlumnos v) {
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
        vca.desactivar();
        //  System.out.println("objeto: "+vca.getName());
    }
}
