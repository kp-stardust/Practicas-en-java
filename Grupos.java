package testloco;
import java.util.Scanner; 

/** Diseñar e implementar un programa que solicite el numero de estudiantes de un grupo y el tamaño de los equipos 
 * a formar, y que muestre cuantos equipos se formaran y cuantos alumnos se quedaran sin grupo.
 * @author K.Villegas
 * @version 05 de Mayo de 2020*/

public class Grupos 
{

	public static void main(String[] args) 
	{
		int total, tamanio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese total de estudiantes: ");
		total = teclado.nextInt();
		System.out.println("Cantidad de miembros de grupo: ");
		tamanio = teclado.nextInt();
		System.out.println ("Pueden armarse: " + (total/tamanio) + " grupos.");
		System.out.println("Quedaran sin grupo: " + (total%tamanio) + " alumnos.");
		

	}

}
