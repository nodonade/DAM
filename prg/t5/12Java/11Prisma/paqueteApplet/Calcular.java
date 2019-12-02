package paqueteApplet;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class Calcular implements ActionListener {
	JTextField objArista; 
	JTextField objAltura; 
	JLabel objArea;
	JLabel objVolumen;
	double arista, altura;
	double area, volumen;
	AudioClip sonido;
	
	public Calcular(JTextField txtArista, JTextField txtAltura, JLabel etiResArea, JLabel etiResVolumen) {
		objArista = txtArista;
		objAltura = txtAltura;
		objArea = etiResArea;
		objVolumen = etiResVolumen;
	}

	public void actionPerformed(ActionEvent e) {

		
		if (objArista.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Introduce la arista.");
			return;
		}
		
		try{
			arista = Double.parseDouble(objArista.getText().replace(',', '.'));
			if (arista <= 0){
				JOptionPane.showMessageDialog(null, "Introduce una arista positiva.");
				return;
			}
		}
		catch (Exception e1){
			JOptionPane.showMessageDialog(null, "Introduce una arista numérica.");
			return;
		}

		if (objAltura.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Introduce la altura.");
			return;
		}
		
		try{
			altura = Double.parseDouble(objAltura.getText().replace(',', '.'));
			if (altura <= 0){
				JOptionPane.showMessageDialog(null, "Introduce una altura positiva.");
				return;
			}
		}
		catch (Exception e1){
			JOptionPane.showMessageDialog(null, "Introduce una altura num�rica.");
			return;
		}

		try{
			
			double area_base = Math.pow (arista,2);
			double area_lateral = 4 * arista * altura;
			
			area = (2 * area_base + area_lateral);
			volumen = (area_base * altura);
			
			DecimalFormat miFormato = new DecimalFormat("#,##0.00");
			objArea.setText(miFormato.format((area)));
			objVolumen.setText(miFormato.format((volumen)));
		}
		catch(Exception e1){
			JOptionPane.showMessageDialog(null, "Error en el calculo. Introduce datos num�ricos.");
		}
	}
}
