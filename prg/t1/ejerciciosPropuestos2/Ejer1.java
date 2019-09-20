import java.util.*;

public class Ejer1 {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);
		int n; double a; char c;

		System.out.printf("Dame un entero\n");
		n = kbd.nextInt(); kbd.nextLine();


		System.out.printf("Dame un double\n");
		a = kbd.nextDouble(); kbd.nextLine();

		System.out.printf("Dame un entero\n");
		c =(char) kbd.nextInt(); kbd.nextLine();

		System.out.printf("n vale %d, a vale %f, y c vale %c\n", n, a, c);

	}
}
