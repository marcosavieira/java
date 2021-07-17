
import java.util.Scanner;

public class teste {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a hora: ");
		int hora = leitor.nextInt();
		System.out.println("Digite os minutos: ");
		int min = leitor.nextInt();

		switch (hora) {

		case (7):
			System.out.println("Atraso maximo: " + min);
			break;

		case (8):
			System.out.println("Atraso maximo: " + (60 + min) + " minutos.");
			break;

		case (9):
			System.out.println("Atraso maximo: " + (120 + min) + " minutos.");
			break;

		default:
			System.out.println("Atraso maximo: 0" + " minutos.");

		}

		leitor.close();
	}

}
