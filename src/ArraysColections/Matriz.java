package ArraysColections;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Iforme a quantidade de Alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Informe a quantidade de notas por Aluno: ");
		int qtdNotas = entrada.nextInt();
		
		double NotasDaTurma [][] = new double [qtdAlunos][qtdNotas];
		double total = 0;
		
		for (int a = 0; a < NotasDaTurma.length; a++) {
			for (int n = 0; n < NotasDaTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d :" ,n + 1, a + 1);
				NotasDaTurma [a][n] = entrada.nextDouble();
				total += NotasDaTurma[a][n];
			}
			
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		
		System.out.println("Média da Turma é: " + media);
		
		
		entrada.close();
	}

}
