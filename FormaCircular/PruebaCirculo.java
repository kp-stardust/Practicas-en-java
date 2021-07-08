package conClases;
import java.util.Scanner;
/** Programa de prueba para la clase FormaCircular.
 * Implementar la clase FormaCircular.
Escribe un programa para testear la clase. Este programa deber�a permitir al usuario ingresar un valor para el radio 
del c�rculo, y mostrar �rea, circunferencia y di�metro de este c�rculo invocando los m�todos apropiados de la clase 
FormaCircular.
Modificar el programa de prueba para que una vez mostrada la informaci�n el usuario pueda reiniciar el radio del 
c�rculo. El �rea, circunferencia y di�metro del circulo ser�n mostrados otra vez.
 * @author K.Villegas
 * @version 06 de Junio 2020
 * */
public class PruebaCirculo {

	public static void main(String[] args) 
	{
		
		double radio;
		radio = validarRadio("Ingrese un valor de radio: ");
		FormaCircular circulo1 = new FormaCircular(radio);
		System.out.println("El area del circulo es: " + circulo1.calcularArea());
		System.out.println("La circunferencia del c�rculo es: " + circulo1.calcularCircunferencia());
		System.out.println("El di�metro del c�rculo es: " + circulo1.calcularDiametro());
		
		radio = validarRadio("Ingrese nuevo valor para el radio: ");
		circulo1.setRadio(radio);
		System.out.println("El area del circulo es: " + circulo1.calcularArea());
		System.out.println("La circunferencia del c�rculo es: " + circulo1.calcularCircunferencia());
		System.out.println("El di�metro del c�rculo es: " + circulo1.calcularDiametro());
	}
	
   public static double validarRadio(String msj) 
	   {
		   double radioT;
		   Scanner teclado = new Scanner(System.in);
		   System.out.println(msj);
		   radioT = teclado.nextDouble();
		   while (radioT < 1) 
			{
				System.out.println("Debe ser un valor positivo");
				System.out.println("Ingrese un valor de radio: ");
				radioT = teclado.nextDouble();
			}
		   return radioT;
	   }

}
