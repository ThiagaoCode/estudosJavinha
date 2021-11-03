package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int a,b;
		
		System.out.println("\n Digite o primerio valor: ");
		a = leia.nextInt();
		
		System.out.println("\n Digite o segundo valor: ");
		b = leia.nextInt();
		
		
		int soma = soma(a,b);
		int sub = sub(a,b);
		int div = div(a,b);
		int mult = mult(a,b);
		
		
		System.out.println("\nSoma é: " +  soma);
		System.out.println("\nSUbtraçao é: " + sub);
		System.out.println("\nDivisao é: " + div);
		System.out.println("\nMultiplicação é: " + mult);
		
		
			
		
	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}
	
	public static int mult(int a, int b) {
		return a * b;
	}

}
