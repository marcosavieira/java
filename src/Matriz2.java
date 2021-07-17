import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quantidade de Alunos: ");
		int qtdAlunos = entrada.nextInt();

		System.out.println("Digite a quantidade de notas por aluno: ");
		int qtdNotas = entrada.nextInt();

		double notasDaTurma[][] = new double[qtdAlunos][qtdNotas];
		double total = 0;

		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {

				System.out.printf("Informe a nota %d do aluno %d", n + 1, a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();

				total += notasDaTurma[a][n];

			}

			double media = total / (qtdNotas * qtdAlunos);

			System.out.printf(" a média da turma é %d" + media);
			
			for (double[] notasDoAluno : notasDaTurma) {
				
			}

			entrada.close();

		}

	}

}
