package testloco;

import java.util.Scanner;
/** Considera una máquina expendedora que ofrece las siguientes opciones:
[1] Chicle
[2] Chocolate
[3] Pochoclos (popcorn)
[4] Jugo
[5] Mostrar total vendido
[6] Salir
Diseñar e implementar un programa que continuamente permita a los usuarios seleccionar de estas opciones. Cuando se 
eligen las opciones 1–4 se muestra un mensaje con la opción elegida. Por ejemplo:
"Aquí están tus chocolates"
Cuando se elige la opcion 5, se muestra la cantidad de ítems vendidos. 
Con la opcion 6 cierra el programa. Si una opcion distinta de 1-6 es ingresada se muestra un mensaje de error. 
 * @author K.Villegas
 * @version 09 de Mayo de 2020 */

public class Kiosco 
{
	public static void main(String[] args) 
	{
		int chicle = 0;
		int chocolate = 0;
		int pochoclo = 0;
		int jugo = 0;
		int opcion;
		boolean salir = false;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Elige opcion de producto: 1, 5 ");
			System.out.println("1 - CHICLES");
			System.out.println("2 - CHOCOLATES");
			System.out.println("3 - POCHOCLOS");
			System.out.println("4 - JUGO");
			System.out.println("5 - Ver el total vendido hasta el momento");
			System.out.println("6 - Salir");
		    opcion = teclado.nextInt();
		    
		    switch (opcion) 
		    {
		    case 1: System.out.println("Aquí están tus chicles");
		    		System.out.println();
		    		chicle = chicle + 1;
		    break;
		    case 2: System.out.println("Aquí están tus chocolates");
		    		System.out.println();
		    		chocolate = chocolate + 1;
		    break;
		    case 3: System.out.println("Aquí están tus pochoclos");
		    		System.out.println();
		    		pochoclo = pochoclo + 1;
		    break;
		    case 4: System.out.println("Aquí está tu jugo");
		    		System.out.println();
		    		jugo = jugo + 1;
		    break;
		    case 5: System.out.println("Total de chicles vendidos: " + chicle);
		    		System.out.println("Total de chocolates vendidos: " + chocolate);
		    		System.out.println("Total de pochoclos vendidos: " + pochoclo);
		    		System.out.println("Total de jugos vendidos: " + jugo);
		    break;
		    case 6: salir = true;
		    break;
		    default: System.out.println("Opcion invalida");
		    }
			
		}while (salir == false);
		
		

	}

}
