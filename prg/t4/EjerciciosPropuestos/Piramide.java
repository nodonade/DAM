public class Piramide {
	public static void main (String [] args) {
		int size = 5;

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.printf("%s \t", (piramide(i, j)  != 0) ? piramide(i, j) : "");
			}
			System.out.println();
		}
	}
	public static int piramide(int i, int j) {
		if (i == 1 && j == 1)
			return 1;
		else if (i < 0 || j < 0)
			return 0;


		return piramide(i -1, j) + piramide(i - 1, j - 1) + piramide(i - 1, j - 2);
	}
}