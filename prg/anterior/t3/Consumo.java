
/*
 * Description of program
 *
 * @author Ignacio E. Loyola @nodonade.com
 * @version 0.1
 *
 */


public class Consumo {
	private double kms, litros, vMed, pGas;

	public Consumo() {
		kms = 0;
		litros = 0;
		vMed = 0;
		pGas = 0;
	}
	public double getTiempo( ) {
		return kms * vMed;
	}

	public double consumoMedio( ) {
		return kms / litros * 100;
	}

	public double consumoEuros( ) {
		return consumoMedio() * pGas;
	}

	public void setKms( double k ) {
		kms = k;
	}

	public void setLitros( double mL ) {
		litros = mL;
	}

	public void setVMed( double vM ) {
		vMed = vM;
	}

	public void setPGas( double nPGas ) {
		pGas = nPGas;
	}
}
