/*
Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. 
Em seguida, mostre na tela:
Todos os elementos dos índices ímpares do vetor 
Todos os elementos do vetor que são números pares
A Soma de todos os elementos do vetor
A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
*/

package Array;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor [] = new int [10];
		int pares = 0, impares = 0, soma = 0;
		float media;
		
		for (int x = 0; x < 10; x++) {
			System.out.println("Digite um número:");
			vetor[x] = leia.nextInt();
			soma = soma + vetor[x];
		}
		
		System.out.println("Todos os elementos dos índices ímpares do vetor: ");
		for(int x = 0; x < 10; x++) {
			if ( x % 2 != 0) {
				impares = vetor[x];
				System.out.println(impares);
			}
		}
		
		System.out.println("Todos os elementos do vetor que são números pares: ");
		for(int x = 0; x < 10; x++) {
			if (vetor[x] % 2 == 0) {
				pares = vetor[x];
				System.out.println(pares);
			}
		}
		
		System.out.println("A Soma de todos os elementos do vetor: " + soma);
		
		media = soma / 10;
		System.out.println("A Média de todos os elementos do vetor: " + media);
	}
}
