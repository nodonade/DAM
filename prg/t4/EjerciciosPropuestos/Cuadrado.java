public class Cuadrado {
	public static void main (String [] args) {
		int size = 5;

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.print(cuadrado(i, j) + "\t");
			}
			System.out.println();
		}
	}
	public static int cuadrado(int i, int j) {
		if (i == 1 || j == 1)
			return 1;

		return cuadrado(i, j-1) + cuadrado(i - 1, j);
	}
}