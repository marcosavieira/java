package testeEscola;

import java.util.Scanner;

public class Cad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int numAlunos[] = new int[3];
		String nomeAlunos[] = new String[3];
		double notas[] = new double[3];
		double total = 0;

		for (int i = 0; i < nomeAlunos.length; i++) {
			System.out.println("Digite o nome do Aluno " + (i + 1) + ":");
			nomeAlunos[i] = entrada.next();
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Digite a nota " + (j + 1) + " do Aluno: " + nomeAlunos[i]);
				notas[j] = entrada.nextDouble();
				total += notas[j];

			}
			
			

		}
		for (int i = 0; i < nomeAlunos.length; i++) {
			System.out.print(nomeAlunos[i]);
			
		}
		entrada.close();
	}

}
