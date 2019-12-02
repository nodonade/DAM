package paqueteJava;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class VentanaCilindro {

	JFrame miVentana = new JFrame("Cilindro");
	JPanel marPrincipal = new JPanel();
	JPanel marSupIzq = new JPanel();
	JPanel marSupDer = new JPanel();
	JPanel marRadio = new JPanel();
	JPanel marAltura = new JPanel();
	JPanel marSuperior = new JPanel();
	JPanel marDatos = new JPanel();
	JPanel marResultados = new JPanel();
	JPanel marBoton = new JPanel();
	JTextField txtRadio = new JTextField (7);
	JTextField txtAltura = new JTextField (7);
	JButton botonCalcular = new JButton();
	JLabel imgFormula = new JLabel();
	JLabel etiRadio = new JLabel();
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

	public VentanaCilindro(){
		miVentana.setSize(475,253);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miVentana.setLayout(new BorderLayout());
		marPrincipal.setLayout(new BorderLayout());
		marSupDer.setLayout(new BorderLayout());
		marDatos.setLayout(new BorderLayout());

		marSupIzq.setBackground(Color.WHITE);
		marSuperior.setBackground(Color.WHITE);
		marDatos.setBackground(Color.WHITE);
		marRadio.setBackground(Color.WHITE);
		marAltura.setBackground(Color.WHITE);
		marBoton.setBackground(Color.WHITE);
		marResultados.setBackground(Color.WHITE);

		marDatos.setBorder(titDatos);
		marResultados.setBorder(titResultados);

		imgFormula.setIcon(new ImageIcon(getClass().getResource("Cilindro.jpg")));
		imgFormula.setHorizontalAlignment(JLabel.CENTER);
		imgFormula.setVerticalAlignment(JLabel.CENTER);

		etiRadio.setText("Radio (cm)");
		etiRadio.setFont(fuente);
		etiRadio.setPreferredSize(new Dimension(100,25));
		etiRadio.setHorizontalAlignment(JTextField.CENTER);

		etiAltura.setText("Altura (cm)");
		etiAltura.setFont(fuente);
		etiAltura.setPreferredSize(new Dimension(100,25));
		etiAltura.setHorizontalAlignment(JTextField.CENTER);

		txtRadio.setFont(fuente);
		txtRadio.setForeground(Color.BLUE);
		txtRadio.setBackground(Color.YELLOW);
		txtRadio.setHorizontalAlignment (JTextField.CENTER);
		txtRadio.setPreferredSize(new Dimension(100,25));

		txtAltura.setFont(fuente);
		txtAltura.setForeground(Color.BLUE);
		txtAltura.setBackground(Color.YELLOW);
		txtAltura.setHorizontalAlignment(JTextField.CENTER);
		txtAltura.setPreferredSize(new Dimension(100,25));

		botonCalcular.setText("Calcular");
		botonCalcular.setIcon(new ImageIcon(getClass().getResource("Calcular.gif")));
		botonCalcular.setPreferredSize(new Dimension(125,40));
		botonCalcular.addActionListener(new Calcular(txtRadio, txtAltura, etiResArea, etiResVolumen));

		etiArea.setText("Área (cm²)");
		etiArea.setFont(fuente);
		etiArea.setHorizontalAlignment (JTextField.CENTER);
		etiArea.setPreferredSize(new Dimension(100,25));

		etiVolumen.setText("Volumen (cm³)");
		etiVolumen.setFont(fuente);
		etiVolumen.setHorizontalAlignment (JTextField.CENTER);
		etiVolumen.setPreferredSize(new Dimension(110,25));

		etiResArea.setFont(new Font("Arial",1,14));
		etiResArea.setForeground(Color.BLUE);
		etiResArea.setBackground(Color.ORANGE);
		etiResArea.setPreferredSize(new Dimension(100,25));
		etiResArea.setHorizontalAlignment (JTextField.CENTER);
		etiResArea.setOpaque(true);

		etiResVolumen.setFont(new Font("Arial",1,14));
		etiResVolumen.setForeground(Color.BLUE);
		etiResVolumen.setBackground(Color.ORANGE);
		etiResVolumen.setPreferredSize(new Dimension(100,25));
		etiResVolumen.setHorizontalAlignment (JTextField.CENTER);
		etiResVolumen.setOpaque(true);

		marSupIzq.add(imgFormula);
		marRadio.add(etiRadio);
		marRadio.add(txtRadio);
		marAltura.add(etiAltura);
		marAltura.add(txtAltura);
		marDatos.add("North",marRadio);
		marDatos.add("Center",marAltura);
		marBoton.add(botonCalcular);
		marSupDer.add("North",marDatos);
		marSupDer.add("Center",marBoton);
		marSuperior.add(marSupIzq);
		marSuperior.add(marSupDer);
		marResultados.add(etiArea);
		marResultados.add(etiResArea);
		marResultados.add(etiVolumen);
		marResultados.add(etiResVolumen);
		marPrincipal.add("North",marSuperior);
		marPrincipal.add("Center",marResultados);
		miVentana.add("North",marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new VentanaCilindro();
	}
}
