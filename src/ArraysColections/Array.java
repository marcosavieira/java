package ArraysColections;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {

		double notasAluno[] = new double[3];
		notasAluno[0] = 8.0;
		notasAluno[1] = 9.0;
		notasAluno[2] = 4.0;

		Arrays.toString(notasAluno);

		double total = 0;

		for (int a = 0; a < notasAluno.length; a++) {
			total += notasAluno[a];

		}

		System.out.println(total / notasAluno.length);

		double notasAlunoB[] = { 9.0, 10.0, 5.0 };
		double totalB = 0;

		for (int a = 0; a < notasAlunoB.length; a++) {
			totalB += notasAlunoB[a];

			System.out.println(totalB / 3);

		}
	}
}