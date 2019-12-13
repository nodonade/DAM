import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Centro implements ActionListener {

	JTextField objMensaje;
	
	public Centro(JTextField txtMensaje) {
		objMensaje = txtMensaje;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		objMensaje.setText("IES El Grao");
	}

}
