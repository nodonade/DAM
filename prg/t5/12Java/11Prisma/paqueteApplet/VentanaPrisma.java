package paqueteApplet;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class VentanaPrisma extends JApplet{
	private static final long serialVersionUID = -5319041609370015814L;
	JPanel marPrincipal = new JPanel();
	JPanel marDerecho = new JPanel();
	JPanel marIzquierdo = new JPanel();
	JPanel marArista = new JPanel();
	JPanel marAltura = new JPanel();
	JPanel marDatos = new JPanel();
	JPanel marResultados = new JPanel();
	JPanel marBoton = new JPanel();
	JButton botCalcular = new JButton();
	JTextField txtArista = new JTextField (7);
	JTextField txtAltura = new JTextField (7);
	JLabel imgFormula = new JLabel();
	JLabel etiArista = new JLabel();
	JLabel etiAltura = new JLabel();
	JLabel etiArea = new JLabel();
	JLabel etiVolumen = new JLabel();
	JLabel etiResArea = new JLabel();
	JLabel etiResVolumen = new JLabel();

	Font fuente = new Font("Arial", 0, 14);

	Border linea = BorderFactory.createLineBorder(Color.gray);
	TitledBorder titDatos = BorderFactory.createTitledBorder(linea, "Datos",
			TitledBorder.LEFT, TitledBorder.TOP, fuente, Color.blue);
	TitledBorder titResultados = BorderFactory.createTitledBorder(linea, "Resultados",
			TitledBorder.LEFT, TitledBorder.TOP, fuente, Color.red);


	public VentanaPrisma(){
		marDatos.setLayout(new BorderLayout());
		marDerecho.setLayout(new BorderLayout());

		marDatos.setBorder(titDatos);
		marResultados.setBorder(titResultados);

		imgFormula.setIcon(new ImageIcon(getClass().getResource("Prisma.jpg")));
		imgFormula.setHorizontalAlignment(JLabel.CENTER);
		imgFormula.setVerticalAlignment(JLabel.CENTER);

		etiArista.setText("Arista (cm)");
		etiArista.setFont(fuente);
		etiArista.setPreferredSize(new Dimension(100,20));
		etiArista.setHorizontalAlignment(JTextField.CENTER);

		etiAltura.setText("Altura (cm)");
		etiAltura.setFont(fuente);
		etiAltura.setPreferredSize(new Dimension(100,20));
		etiAltura.setHorizontalAlignment(JTextField.CENTER);

		txtArista.setFont(fuente);
		txtArista.setForeground(Color.BLUE);
		txtArista.setBackground(Color.YELLOW);
		txtArista.setHorizontalAlignment (JTextField.CENTER);
		txtArista.setPreferredSize(new Dimension(100,20));

		txtAltura.setFont(fuente);
		txtAltura.setForeground(Color.BLUE);
		txtAltura.setBackground(Color.YELLOW);
		txtAltura.setHorizontalAlignment(JTextField.CENTER);
		txtAltura.setPreferredSize(new Dimension(100,20));

		botCalcular.setText("Calcular");
		botCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
		botCalcular.setPreferredSize(new Dimension(125,40));
		botCalcular.addActionListener(new Calcular(txtArista, txtAltura, etiResArea, etiResVolumen));

		etiArea.setText("Área (cm²)");
		etiArea.setFont(fuente);
		etiArea.setHorizontalAlignment (JTextField.CENTER);
		etiArea.setPreferredSize(new Dimension(110,20));

		etiVolumen.setText("Volumen (cm³)");
		etiVolumen.setFont(fuente);
		etiVolumen.setHorizontalAlignment (JTextField.CENTER);
		etiVolumen.setPreferredSize(new Dimension(110,20));

		etiResArea.setFont(new Font("Arial",1,14));
		etiResArea.setForeground(Color.BLUE);
		etiResArea.setBackground(Color.ORANGE);
		etiResArea.setPreferredSize(new Dimension(100,20));
		etiResArea.setHorizontalAlignment (JTextField.CENTER);
		etiResArea.setOpaque(true);

		etiResVolumen.setFont(new Font("Arial",1,14));
		etiResVolumen.setForeground(Color.BLUE);
		etiResVolumen.setBackground(Color.ORANGE);
		etiResVolumen.setPreferredSize(new Dimension(100,20));
		etiResVolumen.setHorizontalAlignment (JTextField.CENTER);
		etiResVolumen.setOpaque(true);

		marArista.add(etiArista);
		marArista.add(txtArista);
		marAltura.add(etiAltura);
		marAltura.add(txtAltura);
		marDatos.add("North",marArista);
		marDatos.add("Center",marAltura);
		marBoton.add(botCalcular);
		marResultados.add(etiArea);
		marResultados.add(etiResArea);
		marResultados.add(etiVolumen);
		marResultados.add(etiResVolumen);
		marIzquierdo.add(imgFormula);
		marDerecho.add("North",marDatos); 
		marDerecho.add("Center",marBoton); 
		marDerecho.add("South",marResultados); 
		marPrincipal.add(marIzquierdo);
		marPrincipal.add(marDerecho);
	
		Container navegador = this.getContentPane();
		navegador.add(marPrincipal);
	}

	public void init() {
		try { new VentanaPrisma(); }
		catch(Exception e) {  e.printStackTrace(); }
	}
}
