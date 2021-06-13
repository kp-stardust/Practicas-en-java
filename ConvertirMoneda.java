package testloco;

import java.util.Scanner;

/** Diseñar e implementar un programa que convierta una suma de dinero a una divisa diferente. El monto de dinero a ser
 *  convertido, y la tasa de cambio, son ingresados por el usuario. El programa debería tener métodos separados para:
• obtener la suma de dinero del usuario;
• obtener la tasa de cambio del usuario;
• hacer la conversión;
• mostrar el resultado.
Después de mostrar el resultado se le pregunta al usuario si desea convertir otra suma de dinero. El programa continúa 
hasta que el usuario desea salir.
 * @author K.Villegas
 * @version 12 de Mayo de 2020*/
public class ConvertirMoneda {

	public static void main(String[] args) {
		double dinero;
		double tasa;
		double valor;
		char resp;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Programa para convertir moneda");
			dinero = ingresarMonto();
			tasa = ingresarTasa();
			valor = convertirDinero(dinero, tasa);
			mostrarConversion(valor);
			System.out.println("Desea convertir otra suma? S/N");
			resp = teclado.next().charAt(0);
			
		}while (resp == 'S' || resp == 's');
	}

	static double ingresarMonto() 
	{
		double monto;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese monto de dinero a convertir");
		monto = teclado.nextDouble();
		return monto;
	}
	
	static double ingresarTasa() 
	{
		double tasa;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese tasa de conversión");
		tasa = teclado.nextDouble();
		return tasa;
	}
	
	static double convertirDinero(double dineroIn, double tasaIn) 
	{
		return dineroIn * tasaIn;
	}
	
	static void mostrarConversion (double valorIn) 
	{
		System.out.println("El valor convertido es: " + valorIn);
	}
	
}
