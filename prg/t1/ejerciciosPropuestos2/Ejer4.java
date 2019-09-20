
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer4 {
	public static void main (String [] args) {
		int a = 1, b = 2, c = 3, d = 4, aux = b;

		b = c;
		c = a;
		a = d;
		d = aux;
	}
}
