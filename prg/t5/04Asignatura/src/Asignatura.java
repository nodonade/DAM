import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Asignatura implements ActionListener {

	JTextField objMensaje;
	
	public Asignatura(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("DAM SON");
	}


}
