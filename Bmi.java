package testloco;
import java.util.Scanner;
/** Diseñar e implementar un programa que permita al usuario ingresar su peso y altura e imprimir su índice de 
 * masa corporal (BMI en inglés).
 * @author K.Villegas
 * @version 07 de Mayo de 2020*/

public class Bmi 
{

	public static void main(String[] args) 
	{
	
		double peso, altura, bmi;
		Scanner respuesta = new Scanner (System.in);
		
		System.out.println("PROGRAMA PARA CALCULAR INDICE DE MASA CORPORAL");
		System.out.println("Ingrese su peso: ");
		peso = respuesta.nextDouble();
		System.out.println("Ingrese su altura: ");
		altura = respuesta.nextDouble();
		bmi = peso/(altura * altura);
		System.out.println("Su indice de masa corporal es: " + bmi);
		if (bmi <= 18.5) 
		{
			System.out.println("Usted tiene infrapeso");
		}
		else 
		{
			if(bmi > 18.5 && bmi <= 24.9)
			{
				System.out.println("Su peso es saludable.");
			}
			else {
				System.out.println("Usted tiene sobrepeso");
			}
		}	
		

	}

}
