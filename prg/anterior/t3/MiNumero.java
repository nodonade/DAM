
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

public class MiNumero {

	public int numero;

	public MiNumero(int n) {
		numero = n;
		doble(numero);
		triple(numero);
		cuadruple(numero);
	}
	public static int doble(int n) {
		System.out.printf("El doble es %d\n", n * 2);
		return n * 2;
	}
	public static int triple(int n) {
		System.out.printf("El triple es %d\n", n * 3);
		return n * 3;
	}
	public static int cuadruple(int n) {
		System.out.printf("El cuadruple es %d\n", n * 4);
		return n * 4;
	}
	public static void main (String [] args) {
		MiNumero n = new MiNumero(42);
	}
}
