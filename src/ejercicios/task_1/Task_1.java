package ejercicios.task_1;

import java.util.*;

public class Task_1 {

	public static void main(String[] args) {
		/*
		 * Task 1: Dado un número, mostrar su serie de Fibonacci. (La serie de Fibonacci
		 * es un orden de números dónde cada número es la suma de los dos anteriores).
		 */

		preguntaTask1();
	}

	private static void preguntaTask1() {
		Scanner scanner = new Scanner(System.in);
		int num;

		do {
			System.out.print("Escribe número el cual deseas saber su serie Fibonacci(que no sea 0): ");
			num = scanner.nextInt();
		} while (num <= 1);

		fibonacci(num);

		scanner.close();
	}

	private static int fibonacci(int num) {

		int numFibo1 = 1, numFibo2 = 1;

		System.out.println("La serie del número " + num + " en Fibonacci es:");

		System.out.print(numFibo1 + " ");
		int i;
		for (i = 2; i <= num; i++) {
			System.out.print(numFibo2 + " ");
			numFibo2 = numFibo1 + numFibo2;
			numFibo1 = numFibo2 - numFibo1;
		}
		return 0;

	}

}
