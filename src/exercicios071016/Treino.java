package exercicios071016;

import java.util.Random;
import java.util.Scanner;

public class Treino {
	
	public Treino() {
		
		//exercicio1();
		//exercicio2();
		exercicio3();
		
	}
	
	private void exercicio1() {
		
		int num1 = (new Scanner(System.in)).nextInt();
		int num2 = (new Scanner(System.in)).nextInt();
		
		if (num1>num2) {
			System.out.println("O numero 1 e o maior");
		} else {
			System.out.println("O numero 2 e o maior");
		}
		
	}
	
	private void exercicio2() {
		
		System.out.println("Introduza o primeiro numero: ");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o segundo numero: ");
		int num2 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o terceiro numero: ");
		int num3 = (new Scanner(System.in)).nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O numero 1 e o maior");
		} else if (num2 > num1 && num2 > num3)
			System.out.println("O numero 2 e o maior");
		else {
			System.out.println("O numero 3 e o maior");
		}
		
	}
	
	private void exercicio3() {
		
		int rand = (new Random()).nextInt(5);
		
		for (int i=0; i<5; i++) {
			System.out.println("Introduza a " + (i+1) + " tentativa");
			int tent = ((new Scanner(System.in)).nextInt());
			
			if (tent == rand) {
				System.out.println("Acertou a " + (i+1) + " tentativa");
				return;
			} else
				System.out.println("Vá tentando que eu estou a gostar");
			
		}
		
		System.out.println("Tens 5 tentativa para acertar num numero de 1 a 5 e consegues falhar");
		
	}
	
}
