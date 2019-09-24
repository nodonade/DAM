
/*
 * Ejercicio 7 Secuencial
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer7S {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Dame un cateto: ");
		double b = kbd.nextDouble(); kbd.nextLine();

		System.out.printf("Dame otro cateto: ");
		double c = kbd.nextDouble(); kbd.nextLine();

		System.out.printf("La hipotenusa vale: %.2f\n", Math.sqrt(b *  b + c * c));
	}
}
