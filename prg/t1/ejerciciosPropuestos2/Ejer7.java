
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Ejer7{
	public static void main (String [] args) {
		int c = 13;

		System.out.printf("c (%d) es %s, %s, %s es multiplo de 5, %s es multiplo de 10, %s que 100\n", c, c < 0 ? "negativo" : "positivo", c % 2 == 0 ? "par" : "impar", c % 5 == 0 ? "" : "no", c % 10 == 0 ? "" : "no", c < 100 ? "menor" : "mayor" );
	}
}
