import java.util.*;

public class Ejercicio1 {

	public static void main ( String [] args ) {
		Scanner kbd = new Scanner(System.in);

		System.out.println("Deme filas: ");
		int filas = kbd.nextInt();

		System.out.println("Deme columnas: ");
		int columnas = kbd.nextInt();

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
