package testloco;

import java.util.Scanner;

/** Escribe un programa con un menú que provee tres opciones:
La primera permite al usuario ingresar una temperatura en  Celsius y muestra la temperatua Fahrenheit correspondiente.
La segunda permite al usuario ingresar una temperatura Fahrenheit y muestra la correspondiete temperatura Celsius.
La tercera permite salir.
El usuario no puede ingresar una temperatura debajo de cero absoluto, esto es: −273.15C, or −459.67F.
 * @author K.Villegas
 * @version 12 de Mayo de 2020*/
public class Temperatura 
{

	public static void main(String[] args) 
	{
		
		int opcion;
		Scanner teclado = new Scanner(System.in);
		
		
		do {
			System.out.println("Programa para convertir temperaturas");
			System.out.println();
			System.out.println("Elija una opción: ");
			System.out.println("1 - Convertir de grados Celsius a Fahrenheit.");
			System.out.println("2 - Convertir de grados Fahrenheit a Celsius.");
			System.out.println("3 - Salir");
			opcion = teclado.nextInt();
			switch(opcion) 
			{
				case 1: tempFahrenheit();
				break;
				case 2: tempCelsius();
				break;
				case 3: break;
				default: System.out.println("La opción ingresada no es válida (1 - 3");
			}
		}while (opcion != 3);

	}
	
	static void tempFahrenheit () 
	{
		double temp;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese temperatura en grados celsius: ");
		temp = teclado.nextDouble();
		if (temp < -273.15) 
		{
			System.out.println("Valor inválido, no se pueden ingresar valores menores a cero absoluto");
		}
		else {
			System.out.println("La temperatura en Fahrenheit es: " + ((temp * 1.8) + 32));
		}
	}
	
	static void tempCelsius() 
	{
		double temp;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la temperatura en grados Fahrenheit: ");
		temp = teclado.nextDouble();
		if (temp < -459.67) 
		{
			System.out.println("Valor inválido, no se pueden ingresar valores menores a cero absoluto");
		}
		else {
			System.out.println("La temperatura en grados celsius es: " + ((temp - 32)/1.8));
		}
	}

}
