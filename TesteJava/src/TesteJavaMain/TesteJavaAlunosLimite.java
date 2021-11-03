package TesteJavaMain;

import java.util.Scanner;

 /* Limitacao de alunos por numero de viagens == 10; Sem Monitores não pode ter viagem!*/

public class TesteJavaAlunosLimite {

	public static void main(String[] args) {

		int a, b; 
		float viagem;

		
		Scanner leia = new Scanner(System.in);

		System.out.println("\n Entre com o numero de Alunos no passeio:");

		a = leia.nextInt();

		System.out.println("\n Entre com o numero de Monitores no passeio:");

		b = leia.nextInt();

		if (b != 0) {
			
			System.out.println("\n Passeio liberardo!");

			viagem = ( a+b ) / 10;
			System.out.println("\n Numero de viagens: " + viagem);
			

		} else {
			System.out.println("\n Não pode ter passeio!");
		}

	}
}
