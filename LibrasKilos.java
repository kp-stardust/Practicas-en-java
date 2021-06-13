package testloco;
import java.util.Scanner;

/** Pseudocódigo de un programa para pasar libras a kilos:
 * BEGIN
	PROMPT for value in pounds
	ENTER value in pounds
	SET value to old value ÷ 2.2
	DISPLAY value in kilos
END
Implementar este programa.
 * @author K.Villegas
 * @version 12 de Mayo 2020
 * */

public class LibrasKilos 
{

	public static void main(String[] args) 
	{	
	double valor;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese valor en libras: ");
	valor = teclado.nextDouble();
	System.out.println("El valor en kilos es: " + convertirAKilos(valor));

	}
	
	static double convertirAKilos (double val) 
	{
		return val = val/2.2;
	}

}
