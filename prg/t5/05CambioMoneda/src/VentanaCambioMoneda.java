
import java.awt.*;
import javax.swing.*;

public class VentanaCambioMoneda{
	
	JFrame miVentana = new JFrame("Avanzado");
	
	JPanel marPrincipal = new JPanel();
	JPanel marEuros = new JPanel();
	JPanel marDolares = new JPanel();
	JPanel marBotones = new JPanel();
	
	JLabel etiEuros = new JLabel();
	JLabel etiDolares = new JLabel();
	
	JTextField txtEuros = new JTextField(20);
	JTextField txtDolares = new JTextField(20);
	
	JButton botCalcEuroDolaro = new JButton();
	
	public VentanaCambioMoneda() {
		
		miVentana.setSize(400, 100);
		miVentana.setLocationRelativeTo(null);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLayout(new BorderLayout());
		
		etiEuros.setText("Euros (€)");
		etiEuros.setFont(new Font("Arial", 0, 14));
		etiEuros.setForeground(Color.BLUE);
		etiEuros.setPreferredSize(new Dimension(80, 25));
		etiEuros.setHorizontalAlignment(JTextField.CENTER);
		etiEuros.setVerticalAlignment(JTextField.TOP);
		
		etiDolares.setText("Euros (€)");
		etiDolares.setFont(new Font("Arial", 0, 14));
		etiDolares.setForeground(Color.BLUE);
		etiDolares.setPreferredSize(new Dimension(80, 25));
		etiDolares.setHorizontalAlignment(JTextField.CENTER);
		etiDolares.setVerticalAlignment(JTextField.TOP);
		
		txtEuros.setText("");
		txtEuros.setFont(new Font("Courier", 0,20));
		txtEuros.setForeground(Color.BLUE);
		txtEuros.setBackground(Color.YELLOW);
		txtEuros.setHorizontalAlignment(JTextField.CENTER);
		
		txtDolares.setText("");
		txtDolares.setFont(new Font("Courier", 0,20));
		txtDolares.setForeground(Color.BLUE);
		txtDolares.setBackground(Color.YELLOW);
		txtDolares.setHorizontalAlignment(JTextField.CENTER);

		botCalcEuroDolar.setIcon(new ImageIcon(getClass().getResource("Derecha.gif")));
		botCalcEuroDolar.setFont(new Font("Arial", 0, 14));
		botCalcEuroDolar.setPreferredSize(new Dimension(120, 40));
		botCalcEuroDolar.addActionListener(new Centro(txtMensaje));
		
		botLocalidad.setIcon(new ImageIcon(getClass().getResource("Localidad.gif")));
		botLocalidad.setText("Localidad");
		botLocalidad.setFont(new Font("Arial", 0, 14));
		botLocalidad.setPreferredSize(new Dimension(120, 40));
		botLocalidad.addActionListener(new Localidad(txtMensaje));
		
		marMensaje.add(txtMensaje);
		marBotones.add(botCentro);
		marBotones.add(botLocalidad);
		miVentana.add("North", marMensaje);
		miVentana.add("South", marBotones);
		miVentana.setVisible(true);
	}
	
	public static void main(String [] args) {
		new VentanaCentro();
	}
}
