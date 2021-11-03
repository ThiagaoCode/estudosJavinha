package java_modular.digital.inovation.one;

import java_modular.digital.inovation.one.operacao.Calculadora;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Resultado Multiplicação: ");
		System.out.println(calculadora.multi(3, 5));
		System.out.println("\n");
		
		System.out.println("Resultado Divisao: ");
		System.out.println(calculadora.div(20, 5));
		System.out.println("\n");
		
		
		System.out.println("Resultado Soma: ");
		System.out.println(calculadora.soma(3, 5));
		System.out.println("\n");
		
		
		System.out.println("Resultado Adção: ");
		System.out.println(calculadora.sub(50, 5));
		System.out.println("\n");

	}

}
