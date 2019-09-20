
/*
 * Ejercicio 2 Secuencial
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer2S {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);


		System.out.printf("Deme su nombre: ");
		String nombre = kbd.nextLine();

		System.out.printf("Buenos dias, %s\n", nombre);
	}
}
