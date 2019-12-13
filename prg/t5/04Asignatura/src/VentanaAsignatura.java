
import java.awt.*;
import javax.swing.*;

public class VentanaAsignatura{
	JFrame miVentana = new JFrame("Avanzado");
	JPanel marMensaje = new JPanel();
	JPanel marBotones = new JPanel();
	JTextField txtMensaje = new JTextField(20);
	JButton botCentro = new JButton();
	JButton botLocalidad = new JButton();
	JButton botAsignatura = new JButton();
	
	public VentanaAsignatura() {
		
		miVentana.setSize(400, 120);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		txtMensaje.setText("");
		txtMensaje.setFont(new Font("Courier", 0,20));
		txtMensaje.setForeground(Color.BLUE);
		txtMensaje.setBackground(Color.YELLOW);
		txtMensaje.setHorizontalAlignment(JTextField.CENTER);
		
		botCentro.setIcon(new ImageIcon(getClass().getResource("Centro.gif")));
		botCentro.setText("Centro");
		botCentro.setFont(new Font("Arial", 0, 14));
		botCentro.setPreferredSize(new Dimension(120, 40));
		botCentro.addActionListener(new Centro(txtMensaje));
		
		botLocalidad.setIcon(new ImageIcon(getClass().getResource("Localidad.gif")));
		botLocalidad.setText("Localidad");
		botLocalidad.setFont(new Font("Arial", 0, 14));
		botLocalidad.setPreferredSize(new Dimension(120, 40));
		botLocalidad.addActionListener(new Localidad(txtMensaje));
		
		botAsignatura.setIcon(new ImageIcon(getClass().getResource("Asignatura.gif")));
		botAsignatura.setText("Asignatura");
		botAsignatura.setFont(new Font("Arial", 0, 14));
		botAsignatura.setPreferredSize(new Dimension(120, 40));
		botAsignatura.addActionListener(new Asignatura(txtMensaje));
		
		marMensaje.add(txtMensaje);
		marBotones.add(botCentro);
		marBotones.add(botLocalidad);
		marBotones.add(botAsignatura);
		miVentana.add("North", marMensaje);
		miVentana.add("South", marBotones);
		miVentana.setVisible(true);
	}
	
	public static void main(String [] args) {
		new VentanaAsignatura();
	}
}
