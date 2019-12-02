import java.util.*;

public class Letras {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);
	
		System.out.printf("Indique cuantas letras quiere que se generen: ");	
		int nLetras = kbd.nextInt(); kbd.nextLine();
		char letra;
		for (int i = 0; i < nLetras; i++) {
			letra = generaLetra();	
			System.out.printf("La letra %c es %s \n", letra, esVocal(letra) ? "vocal" : "consonante");	
		}
	}
	
	public static char generaLetra() {
		return  (char) ((Math.random() * ('Z' - 'A')) + 'A');
	}

	public static boolean esVocal(char letra) {
		return "AEIOUaeiou".indexOf(letra) != -1;

	}
}
