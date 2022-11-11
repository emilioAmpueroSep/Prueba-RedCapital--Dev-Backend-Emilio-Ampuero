package ejercicios.task_3;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		/*
		 * Task 3: Escriba una función que permita multiplicar dos números sin utilizar
		 * el signo de multiplicación.
		 */

		preguntaTask3();
	}

	private static void preguntaTask3() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa 1er número(Multiplicando): ");
		int num = scanner.nextInt();
		System.out.print("Ingresa 2do número(Multiplicador): ");
		int num2 = scanner.nextInt();

		multiplicar(num, num2);

		scanner.close();
	}

	public static int multiplicar(int num, int num2) {
		int resultado = 0;
		for (int i = 0; i < num2; i++)
			resultado += num;

		System.out.println("El resultado de la multiplicacion es: " + resultado);
		return resultado;
	}

}
