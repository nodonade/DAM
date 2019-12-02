package com.graficos;

import java.awt.*;
import javax.swing.*;

public class Hola {
	JFrame miVentana = new JFrame("Hola");
	JPanel marPrincipal = new JPanel();
	JTextField txt = new JTextField(20);
	
	
	public Hola() {
		miVentana.setSize(500, 200);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txt.setText("Ignacio Loyola");
		txt.setFont(new Font("Courier", 0, 20));
		txt.setForeground(Color.RED);
		txt.setBackground(Color.YELLOW);
		txt.setHorizontalAlignment(JTextField.CENTER);
		
		marPrincipal.add(txt);
		miVentana.add("South", marPrincipal);
		miVentana.setVisible(true);
	}
	
	public static void main(String [] args) {
		new Hola();
	}
}
