import java.util.*;

public class Dinero {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("\nIndique cantidad de dinero: ");
		int d = kbd.nextInt(); kbd.nextLine();

		System.out.printf("\n%d euros son:\n", d);

		int c = 0;
		while (d >=  500) {
			d -= 500;
			c++;
		}
		System.out.printf("\n%d billete(s) de 500", c);

		c = 0;
		while (d >=  200) {
			d -= 200;
			c++;
		}
		System.out.printf("\n%d billete(s) de 200", c);

		c = 0;
		while (d >=  100) {
			d -= 100;
			c++;
		}
		System.out.printf("\n%d billete(s) de 100", c);

		c = 0;
		while (d >=  50) {
			d -= 50;
			c++;
		}
		System.out.printf("\n%d billete(s) de 50", c);

		c = 0;
		while (d >=  20) {
			d -= 20;
			c++;
		}
		System.out.printf("\n%d billete(s) de 20", c);

		c = 0;
		while (d >=  10) {
			d -= 10;
			c++;
		}
		System.out.printf("\n%d billete(s) de 10", c);

		c = 0;
		while (d >=  5) {
			d -= 5;
			c++;
		}
		System.out.printf("\n%d billete(s) de 5", c);

		c = 0;
		while (d >=  2) {
			d -= 2;
			c++;
		}

		System.out.printf("\n%d moneda(s) de 2", c);
		c = 0;
		while(d >= 1) {
			d -= 1;
			c++;
		}
		System.out.printf("\n%d moneda(s) de 1\n", c);
	}
}
