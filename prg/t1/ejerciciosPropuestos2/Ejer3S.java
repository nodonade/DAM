
/*
 * Ejercicio 3 Secuencial
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer3S {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);


		System.out.printf("Deme su entero: ");
		int n = kbd.nextInt();

		System.out.printf("El numero %d tiene como doble %s y como triple %d\n", n, n * 2, n * 3);
	}
}
