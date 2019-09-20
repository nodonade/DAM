
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer4S {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme los grados centigrados: ");
		int g = kbd.nextInt();
		System.out.printf("%d grados centigrados son %.2f grados farenheit\n", g, 32 + (9 * g / 5.0));
	}
}
