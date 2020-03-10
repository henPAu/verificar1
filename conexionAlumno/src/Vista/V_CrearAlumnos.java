package Vista;

import Controlador.Oyente_Crear_ALumno;
import Controlador.Oyente_Eliminar_Alumno;
import Controlador.Oyente_Verificar_Alumno;
import Modelo.Alumno;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V_CrearAlumnos extends JFrame {

    private JTextField textoCedula = new JTextField(20);
    private JTextField textoNombres = new JTextField(20);
    private JTextField textoApellidos = new JTextField(20);
    private JComboBox comboCarrera;
    private JComboBox comboModulo;
    private JTextField textoDireccion = new JTextField(20);
    private JTextField textoTelefono = new JTextField(20);
    private JTextField textoE_mail = new JTextField(20);
    private JTextField textoFec_nacimiento = new JTextField(10);
    private JButton botonGuardar = new JButton("GUARDAR");
    private JButton boton_verificar = new JButton("VERIFICAR");
    private Alumno alumno;

    public V_CrearAlumnos() {
        super("REGISTRO ESTUDIANTE");

        setLocation(50, 50);
        //setSize(450,450);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        this.agregarComponentes();
        pack();
        setVisible(true);

    }

    private void agregarComponentes() {

        JPanel contenedor, panel, panelB;
        panel = new JPanel(new GridBagLayout());

        contenedor = new JPanel(new GridBagLayout());
        panelB = new JPanel();
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints a = new GridBagConstraints();

        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(10, 15, 10, 15);
        c.gridx = 0;
        c.gridy = 0;
        panel.add(new JLabel("Cedula"), c);
        c.gridx = 1;
        panel.add(textoCedula, c);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(new JLabel("Nombres"), c);
        c.gridx = 1;
        panel.add(textoNombres, c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(new JLabel("Apellidos"), c);
        c.gridx = 1;
        panel.add(textoApellidos, c);
        //CREO EL BOTON VERIFICAR
        c.gridx = 2;
        c.gridy = 0;
        panel.add(new JButton("VERIFICAR"), c);
        //
        Vector vCarrera = new Vector();
        vCarrera.addElement("");
        vCarrera.addElement("Desarrollo de  Software");
        vCarrera.addElement("Mecanica Automotriz");
        vCarrera.addElement("Electricidad");
        vCarrera.addElement("Procesamientos de alimentos");

        comboCarrera = new JComboBox(vCarrera);
        comboCarrera.setPreferredSize(new Dimension(200, 25));

        c.gridx = 0;
        c.gridy = 4;
        panel.add(new JLabel("Carrera"), c);
        c.gridx = 1;
        panel.add(comboCarrera, c);
        c.gridx = 0;
        c.gridy = 5;
        panel.add(new JLabel("Modulo"), c);
        c.gridx = 1;

        Vector v = new Vector();
        v.addElement("");
        v.addElement("I");
        v.addElement("II");
        v.addElement("III");
        v.addElement("IV");
        v.addElement("V");

        comboModulo = new JComboBox(v);
        comboModulo.setPreferredSize(new Dimension(150, 25));

        panel.add(comboModulo, c);
        c.gridx = 0;
        c.gridy = 6;
        panel.add(new JLabel("Telefono"), c);
        c.gridx = 1;
        panel.add(textoTelefono, c);

        c.gridx = 0;
        c.gridy = 7;
        panel.add(new JLabel("Fecha de Nacimiento"), c);
        c.gridx = 1;
        c.gridy = 7;
        panel.add(textoFec_nacimiento, c);

        c.gridx = 0;
        c.gridy = 8;
        panel.add(new JLabel("e-mail"), c);
        c.gridx = 1;
        c.gridy = 8;
        panel.add(textoE_mail, c);

        botonGuardar = new JButton("GUARDAR");
        botonGuardar.addActionListener(new Oyente_Crear_ALumno(this));
        JButton btnEliminar = new JButton("ELIMINAR");
        btnEliminar.addActionListener(new Oyente_Eliminar_Alumno(this));
        JButton btnActualizar = new JButton("ACTUALIZAR");
        boton_verificar = new JButton("VERIFICAR");
        boton_verificar.addActionListener(new Oyente_Verificar_Alumno(this));
        //btnActualizar.addActionListener(new OyenteActualizarEstudiante(this));
        panelB.add(botonGuardar);
        panelB.add(btnEliminar);
        panelB.add(btnActualizar);
        a.gridx = 0;
        a.gridy = 0;
        contenedor.add(panel, a);
        a.gridy = 1;
        contenedor.add(panelB, a);
        setContentPane(contenedor);

    }

    public Alumno guardarAlumno() {

        alumno = new Alumno();
        alumno.setNombre(textoNombres.getText());
        alumno.setApellido(textoApellidos.getText());
        alumno.setCarrera((String) comboCarrera.getSelectedItem());
        alumno.setModulo((String) comboModulo.getSelectedItem());
        alumno.setTeléfono(textoTelefono.getText());
        alumno.setCedula(textoCedula.getText());

        return alumno;
    }

    public void bloquear() {
        textoNombres.setEditable(false);
        textoApellidos.setEditable(false);
        comboCarrera.setEnabled(false);
        comboModulo.setEnabled(false);
        textoDireccion.setEnabled(false);
        textoTelefono.setEditable(false);
        textoE_mail.setEditable(false);
        textoFec_nacimiento.setEditable(false);
        botonGuardar.setEnabled(false);
    }

    public void desactivar() {
        textoNombres.setEditable(true);
        textoApellidos.setEditable(true);
        comboCarrera.setEnabled(true);
        comboModulo.setEnabled(true);
        textoDireccion.setEditable(true);
        textoTelefono.setEditable(true);
        textoE_mail.setEditable(true);
        textoFec_nacimiento.setEditable(true);
        botonGuardar.setEnabled(true);
    }

    public void limpiarCampos() {

        textoCedula.setText("");
        textoNombres.setText("");
        textoApellidos.setText("");
        textoTelefono.setText("");
        comboCarrera.setSelectedIndex(0);
        comboModulo.setSelectedIndex(0);
        textoE_mail.setText("");

    }

    public String eliminarAlumno() {
        return textoCedula.getText();

    }
}
