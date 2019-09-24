
/*
 * Programa que calcula el area de un triangulo a partir de la longitud de sus lados
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */

import java.util.*;

public class Triangulo {
	public static void main (String [] args) {
		Scanner kbd = new Scanner(System.in);
		double a,b,c,p;
        	System.out.print("Introduzca longitud del primer lado del triangulo: ");
        	a = kbd.nextDouble();
        	System.out.print("Introduzca longitud del segundo lado del triangulo: ");
        	b = kbd.nextDouble();
        	System.out.print("Introduzca longitud del tercer lado del triangulo: ");
        	c = kbd.nextDouble();
        	p = (a+b+c)/2;
    		System.out.printf("El area es %.2f \n",  Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
}
