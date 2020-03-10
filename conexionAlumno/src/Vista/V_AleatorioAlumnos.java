package Vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class V_AleatorioAlumnos extends JFrame {

    private JList Nimagenes; // cuadro combinado con los nombres de los

    private JLabel etiqueta; // etiqueta para mostrar el icono seleccionado
    private JTextArea Jtexto;
    private JPanel panel;
    private String nombres[]
            = {"leon", "istl", "vida moderna"};

    public V_AleatorioAlumnos() {
        super(" Imagenes");
        dispose();
        setSize(400, 400);
        setLocation(100, 100);
        crearComponentes();
        setVisible(true);

    }

    public void crearComponentes() {
        panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        b.insets = new Insets(10, 50, 20, 10);
        b.gridx = 0;
        b.gridy = 0;
        Nimagenes = new JList(nombres);
        panel.add(Nimagenes, b);
        //Nimagenes.addListSelectionListener(new OyenteJlist());
        b.gridx = 1;
        b.gridy = 0;
        etiqueta = new JLabel("AQUI SE CARGA LA IMAGEN");
        panel.add(etiqueta, b);

        b.gridx = 1;
        b.gridy = 1;
        Jtexto = new JTextArea("AQUI SE CARGA EL TEXTO", 5, 10);
        Jtexto.setEditable(false);
        panel.add(Jtexto, b);

    }
}
