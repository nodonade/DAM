
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Finanzas {

	private double cambioDolarEuro;

	public Finanzas() {
		cambioDolarEuro = 1.36;
	}
	public Finanzas(double cambio) {
		cambioDolarEuro = cambio;
	}

	public void setCambio( double cambio ) {
		cambioDolarEuro = cambio;
	}
	public double dolaresToEuros(double cantidad) {
		return cantidad / cambioDolarEuro;
	}

	public double eurosToDolares(double cantidad) {
		return cantidad * cambioDolarEuro;
	}

	public static void main(String [] args) {
		Finanzas finanzas1 = new Finanzas();

		System.out.println(finanzas1.dolaresToEuros(1));
		System.out.println(finanzas1.eurosToDolares(1));
	}
}
