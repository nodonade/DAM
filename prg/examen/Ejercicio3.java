import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);
		int n, sumaPos = 0, sumaNeg = 0, sumaPar = 0, sumaImp = 0;
		int pares = 0, impares = 0, positivos = 0, negativos = 0, media = 0;
		String s;

		do {
			System.out.println("Introduzca un numero");
			n = kbd.nextInt(); kbd.nextLine();

			if (n > 0) {
				sumaPos += n;
				positivos++;
			}
			else {
				sumaNeg += n;
				negativos++;
			}

			if (n % 2 == 0) {
				sumaPar += n;
				pares++;
			} else {
				sumaImp += n;
				impares++;
			}

			System.out.println("Quiere poner mas numeros?:");
			s = kbd.nextLine();
		} while (s.equals("SI") || s.equals("si"));
		media = sumaNeg + sumaPos;
		media /= (positivos + negativos);

		System.out.printf("la suma de los pares %d, la suma de los impares %d\n", sumaPar, sumaImp);
		System.out.printf("La suma de los positivos %d, la suma de los negativos %d\n", sumaPos, sumaNeg);
		System.out.printf("positivos %d, negativos %d, pares %d, impares %d\n", positivos, negativos, pares, impares);
		System.out.printf("La media es %d\n", media);
	}
}