
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class NumeroDeLaSuerte {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Dame tu dia de nacimiento: ");
		int d = kbd.nextInt(); kbd.nextLine();

		System.out.printf("Dame tu mes de nacimiento: ");
		int m = kbd.nextInt(); kbd.nextLine();

		System.out.printf("Dame tu ano de nacimiento: ");
		int a = kbd.nextInt(); kbd.nextLine();

		int s = d + m + a;
		s = s % 10 + s/10 % 10 + s/100 % 10 + s/1000 % 10;
		s = s % 10 + s / 10 % 10;
		System.out.printf("Tu numero de la suerte es: %d \n", s);
	}
}
