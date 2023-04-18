/*
Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
Todos os elementos da Diagonal Principal
Todos os elementos da Diagonal Secundária
A Soma de todos os elementos da Diagonal Principal
A Soma de todos os elementos da Diagonal Secundária
*/
		
package Array;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//int [][] vetor = {{1,2,3},{4,5,6},{7,8,9}};
		int [] [] numeros = new int [3][3];
		int linha, coluna, somaDiagonalP = 0, somaDiagonalS = 0, media;
		
		String valoresDiagonalP = "", valoresDiagonalS = "";
		
		
			for (linha = 0; linha < 3; linha ++) {
				for (coluna = 0; coluna < 3; coluna ++) {
					
					System.out.printf("Digite um número na posição [%d][%d]: ", linha, coluna);
					numeros [linha][coluna] = leia.nextInt();
					
					
					if(linha == coluna ) {
						somaDiagonalP += numeros[linha][coluna];
						valoresDiagonalP += numeros[linha][coluna] + " ";
					}
					
					if (linha + coluna == 2) {
						somaDiagonalP += numeros[linha][coluna];
						valoresDiagonalS += numeros[linha][coluna];
					}
				}	
			} 
		
		System.out.println("Elementos da Diagonal Principal: " + valoresDiagonalP);
		
		System.out.println("Elementos da Diagonal Secundária: " + valoresDiagonalS);
		
		System.out.println("Soma dos elementos da Diagonal Principal: " + somaDiagonalP );
		
		System.out.println("Soma dos elementos da Diagonal Secundária: " + somaDiagonalS );
	}
}
