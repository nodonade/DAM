
/*
 * Ejercicio 1 Secuencial
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer1S {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		int a, b;
		System.out.printf("Dame un numero: ");
		a = kbd.nextInt(); kbd.nextLine();

		System.out.printf("Dame otro numero: ");
		b = kbd.nextInt(); kbd.nextLine();

		System.out.printf("Los numeros son %d y %d\n", a, b);
	}
}
