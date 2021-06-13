package testloco;

import java.util.Scanner;

/** Usando un bucle For, escribir un programa que muestre las tablas. El usuario elige que tabla se mostrar�.
Usar un while para validar el ingreso de informaci�n y asegurar que el usuario ingrese un n�mero que nunca sea menor 
a 2. De lo contrario mostrar� un mensaje de error y se le pedir� que ingrese un n�mero nuevo.
Finalmente, usar un do�while para pedirle al usuario ingresar 's' o �n� para indicar si desea continuar. 
Idealmente el programa deber�a ejecutarse otra vez si el usuario ingresa 'S' o 's'.
 * @author K.Villegas
 * @version 09 de Mayo de 2020*/

public class Tablas {

	public static void main(String[] args) {
		int nro;
		char resp;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingresa un numero: ");
			nro = teclado.nextInt();
				while (nro < 2) {	
					System.out.println("Numero invalido, debe ser mayor a 2, ingresa de nuevo: ");
					nro = teclado.nextInt();
				}
				System.out.println("Tabla de " + nro);
				for(int i = 1; i<=12; i++) {
			
					System.out.println(nro + " X  " + i + " = " + i * nro);
				}
			System.out.println("Desea ingresar otro numero? S/N");
			resp = teclado.next().charAt(0);
		 }while (resp == 'S' || resp == 's');
	}

}
