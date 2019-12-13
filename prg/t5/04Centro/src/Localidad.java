import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Localidad implements ActionListener {

	JTextField objMensaje;
	
	public Localidad(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("Valencia");
	}

}
