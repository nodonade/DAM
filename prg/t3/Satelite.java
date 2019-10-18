
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */


public class Satelite {
	private double meridiano;
	private double paralelo, distancia_tierra;

	Satelite ( double m, double p, double d ) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	Satelite ( ) {
		meridiano = paralelo = distancia_tierra = 0;
	}
	public void setPosicion ( double m, double p, double d ) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
	}
	public void printPosicion( ) {
		System.out.printf("El satelite se encuentra en el paralelo %.2f meridiano %.2f a una distancia de la tierra de %.2f kilometos\n", paralelo, meridiano, distancia_tierra);
	}
	public void variaAltura(double desplazamiento) {
		distancia_tierra += desplazamiento;
	}
	public boolean enOrbita() {
		return distancia_tierra == 0;
	}
	public void variaPosicion( double variap, double variam ) {
		meridiano += variam;
		paralelo += variap;
	}
}
