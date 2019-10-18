
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */


public class Numero {

	private int numero;

	public Numero() {
		numero = 0;
	}
	public Numero( int n ) {
		numero = n;
	}
	public void anyade ( int n ) {
		numero += n;
	}
	public void resta ( int n ) {
		numero -= n;
	}
	public int getValor() {
		return numero;
	}
	public int getDoble() {
		return numero * 2;
	}
	public int getTriple() {
		return numero * 3;
	}
	public void setNumero ( int n ) {
		numero = n;
	}
	public static void main ( String [] args ) {

	}
}
