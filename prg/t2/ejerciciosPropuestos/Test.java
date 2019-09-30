
/*
 * No se lo que hace, es el ejercicio 6
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Test {
	public static void main (String [] args) {
		Random rnd = new Random();
		int valor = rnd.nextInt(201);

		System.out.printf("El valor es %d, y es %s\n", valor, valor % 2 == 0 ? "par" : "impar");
	}
}
