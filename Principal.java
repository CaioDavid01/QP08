package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double numero2 = scanner.nextDouble();
		
		System.out.println("A subtração do primeiro numero pelo segundo é:" + (numero1 - numero2 ) );
		
		scanner.close();
		
		

	}

}
