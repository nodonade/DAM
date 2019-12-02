import java.util.*;

public class Potencia {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme un numero\n");
		int x = kbd.nextInt(); kbd.nextLine();
		System.out.printf("Deme otro numero\n");
		int y = kbd.nextInt();

		int r = 1;

		for (int i = 0; i < y; i++) {

			r *= x;

		}
		System.out.printf("%d es el resultado\n", r);
	}
}
