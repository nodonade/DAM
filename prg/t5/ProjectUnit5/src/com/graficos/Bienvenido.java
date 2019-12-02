package com.graficos;

import java.awt.*;
import javax.swing.*;

public class Bienvenido {
	JFrame miVentana = new JFrame("Bienvenido!");
	JPanel marPrincipal = new JPanel(new BorderLayout());
	JTextField txtBienvenido = new JTextField(20);

	public Bienvenido() {
		Color azulPastel = new Color(210,253,255);
		
		miVentana.setSize(700,250);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtBienvenido.setText("Bienvenido a Java");
		txtBienvenido.setFont(new Font("Courier", 0,50));
		txtBienvenido.setForeground(azulPastel);
		txtBienvenido.setBackground(new Color(58,190,255));
		txtBienvenido.setHorizontalAlignment(JTextField.CENTER);
		
		marPrincipal.add(txtBienvenido);
		miVentana.add(marPrincipal, BorderLayout.CENTER);
		miVentana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Bienvenido();	
	}
}