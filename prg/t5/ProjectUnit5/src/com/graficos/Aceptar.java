package com.graficos;

import java.awt.event.*;
import javax.swing.*;

public class Aceptar implements ActionListener {

	JTextField objMensaje;
	
	public Aceptar(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("NaDe");
		// TODO Auto-generated method stub
	}

}
