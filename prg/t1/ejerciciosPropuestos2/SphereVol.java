
/*
 * Programa que calcula el volumen de una esfera.
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class SphereVol {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Dame el radio de la esfera: ");
		double r = kbd.nextDouble();

		System.out.printf("El volumen de la esfera de radio %.2f es %.2f\n", r, Math.pow(r, 3) * 4 / 3 * Math.PI );
	}
}
