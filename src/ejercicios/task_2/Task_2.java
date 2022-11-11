package ejercicios.task_2;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		/*
		 * Task 2: Dada una cadena de texto, darle la vuelta a invertir el orden de sus
		 * caracteres, sin usar métodos propios del lenguaje, sólo estructuras de
		 * control.
		 * 
		 * NOTA: Solo se uso un metodo para convertir una cadena de texto a un array,
		 * pero no para recorrerlo y mostrarlo en reversa.
		 */

		preguntaTask2();
	}

	private static void preguntaTask2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Escriba alguna palabra que desea saber como es al revés: ");
		String texto = scanner.nextLine();

		palabraAlReves(texto);

		scanner.close();
	}

	private static String palabraAlReves(String texto) {
		// transforma la cadena de texto a caracteres en un arreglo, luego lo almacena
		// en una variable
		char arreglo[] = texto.toCharArray();

		// Recorre arreglo con estructura de control en reversa luego lo imprime
		for (int i = arreglo.length - 1; i >= 0; i--) {

			System.out.print(arreglo[i]);
		}
		return null;

	}

}
