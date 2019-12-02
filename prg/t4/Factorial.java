import java.util.Scanner;

public class Factorial{
	public static void main(String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme el numero\n");
		int n = kbd.nextInt();
		int r = 1; 
		while(n > 0) {
			r *= n;
			n--;
		}
		System.out.printf("%d \n", r);
	}
}