package testloco;
import java.util.Scanner;

/** Programa que pide al usuario que ingrese valores para el largo y alto de un rectángulo y entonces muestra
 *  su perimetro.
 *  @author K.Villegas
 *  @version 05 de Mayo 2020*/

public class Rectangulo {

	public static void main(String[] args) 
	{
		double largo, altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("CALCULO DE AREA Y PERIMETRO DE UN RECTANGULO");
		System.out.println("Ingrese largo del rectangulo:");
		largo = teclado.nextDouble();
		System.out.println("Ingrese altura del rectangulo:");
		altura = teclado.nextDouble();
		System.out.println("El perimetro es: " + calcularPerimetro(largo, altura));
		System.out.println("El area es: " + calcularArea(largo, altura));
	}
	
	static double calcularPerimetro(double largoIn, double alturaIn) 
	{
		return (largoIn + alturaIn) * 2;
	}
	
	static double calcularArea(double largoIn, double alturaIn) 
	{
		return largoIn * alturaIn;
	}

}
