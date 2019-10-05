
/*
 * Dibuja un rombo
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Rombo {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.printf("Deme la anchura del rombo: ");
		int size = kbd.nextInt();


		    for (int i = 1; i < size; i += 2) {
		        for (int k = size; k >= i; k -= 2) {
        		    System.out.print(" ");
       			 }
  		     	 for (int j = 1; j <= i; j++) {
            			System.out.print("*");
		        }
		        System.out.println();
		    }// end loop

		    for (int i = 1; i <= size; i += 2) {
		        for (int k = 1; k <= i; k += 2) {
		            System.out.print(" ");
		        }
		        for (int j = size; j >= i; j--) {
		            System.out.print("*");
		        }
	        System.out.println();
		}// end loop
	}
}
