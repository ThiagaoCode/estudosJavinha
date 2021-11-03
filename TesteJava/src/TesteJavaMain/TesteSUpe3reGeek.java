package TesteJavaMain;

import java.util.Scanner;

public class TesteSUpe3reGeek {

	public static void main(String[] args) {

		int n;

		Scanner leia = new Scanner(System.in);

		System.out.println("\n Entre com o numero de 0 a 90:");

		n = leia.nextInt();

		for (int x = n; x <= 100; x++) {

			
			
			if (x % 3 == 0 && x % 5 == 0) {

				System.out.println("\n" + x + " SuperGeeks");

			}

			else if (x % 3 == 0) {
				System.out.println("\n" + x + " Super");
			}

			else if (x % 5 == 0) {
				System.out.println("\n" + x + " Geek");
			}
			
			else {
				System.out.println("\n" + x);
			}

		}

	}

}
