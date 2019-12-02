import java.util.Scanner;

public class FibonacciIterativo {
	public static void main(String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme el numero\n");
		int n = kbd.nextInt();

		System.out.println(fibo(n));
	}
	public static int fibo(int n) {
		if ((n == 0) || (n == 1))
      		return n;
		else
			return fibo(n-2)+fibo(n-1);
	}
}