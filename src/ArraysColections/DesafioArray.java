package ArraysColections;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o numero de notas: ");

		int qtdNotas = teclado.nextInt();

		double notas[] = new double[qtdNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota" + (i + 1) + ":\n");
			notas[i] = teclado.nextDouble();
		}

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}

		double media = total / notas.length;

		System.out.println("A média é :\n" + (media) + "!");

		teclado.close();
	}

}
