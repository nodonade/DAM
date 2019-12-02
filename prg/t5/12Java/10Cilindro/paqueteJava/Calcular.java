package paqueteJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class Calcular implements ActionListener {
	JTextField objRadio; 
	JTextField objAltura; 
	JLabel objArea;
	JLabel objVolumen;
	double radio, altura;
	double area, volumen;

	public Calcular(JTextField txtRadio, JTextField txtAltura, JLabel etiResArea, JLabel etiResVolumen) {
		objRadio = txtRadio;
		objAltura = txtAltura;
		objArea = etiResArea;
		objVolumen = etiResVolumen;
	}

	public void actionPerformed(ActionEvent e) {
		if (objRadio.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Introduce el radio.");
			return;
		}

		try{
			radio = Double.parseDouble(objRadio.getText().replace(',', '.'));
			if (radio <= 0){
				JOptionPane.showMessageDialog(null, "Introduce un radio positivo.");
				return;
			}
		}
		catch (Exception e1){
			JOptionPane.showMessageDialog(null, "Introduce un radio numérico.");
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
			JOptionPane.showMessageDialog(null, "Introduce una altura numérica.");
			return;
		}

		try{
			
			double area_base = Math.PI * Math.pow (radio,2);
			double area_lateral = 2 * Math.PI * radio * altura;

			area = (2 * area_base + area_lateral);
			volumen = (area_base * altura);
			
			DecimalFormat miFormato = new DecimalFormat("#,##0.00");
			objArea.setText(miFormato.format((area)));
			objVolumen.setText(miFormato.format((volumen)));
		}
		catch(Exception e1){
			JOptionPane.showMessageDialog(null, "Error en el calculo. Introduce datos numéricos.");
		}
	}
}
