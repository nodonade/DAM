public class Ejercicio4{
	public static void main(String args[]){
		int lineas = 5;
		int contador = 1;
		for(int i=1;i<=lineas;i++){
			contador++;
			for(int j=1;j<=contador;j++){
				for(int k=0;k<j;k++)
					System.out.print("*");
				System.out.println("");
			}
		}
		System.out.println("**");
		System.out.println("**");
	}
}
*
**
*
**
***
*
**
***
****
*
**
***
****
*****
*
**
***
****
*****
******
**
**
