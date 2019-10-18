
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */


public class Peso {
	private double peso;

	public Peso ( double p, String m ) {
		switch ( m ) {
			case "K": peso = p; break;
			case "G": peso = p / 1000; break;
			case "Lb": peso = p * 0.453; break;
			case "Li": peso = p * 14.59; break;
			case "Oz": peso = p * 0.02835; break;
			case "P": peso = p * 0.00155; break;
			case "Q": peso = p * 43.3; break;
		}
	}
	public double getLibras( ) {
		return peso / 0.453;
	}
	public double getLingotes( ) {
		return peso / 14.59;
	}
	public getPeso( String m ) {
	double res=0;
	    switch(medida) {
               case "K":
               res= pesoKG;
               break;

               case "Lb":
               res= pesoKG*1000/453;
               break;

               case "Li":
               res= pesoKG/14.59;
               break;

               case "Oz":
               res= pesoKG/28.35*1000;
               break;

               case "P":
               res= pesoKG/1.55*1000;
               break;

               case "G":
               res= pesoKG*1000;
               break;

               case "Q":
               res= pesoKG/43.3;
               break;

            }
            return res;
	}
	public static void main ( String [] args ) {
		Peso pesito = new Peso( 42, "K" );
		System.out.println(pesito.getLibras( ));
		System.out.println(pesito.getPeso( "G" ));
	}
}
