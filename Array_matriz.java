package Array;

import java.util.Scanner;

public class Array_matriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//duas dimensões ou mais: linhas e colunas
		int [][] numeros = new int[3][3];
		int linha, coluna, somaNumeros = 0, linhaUsuario, colunaUsuario;
		
		for(linha = 0; linha < 3; linha ++) {
			
			for (coluna = 0; coluna < 3; coluna ++) {
				
				System.out.println("Digite um número: ");
				numeros[linha][coluna] = leia.nextInt();
				
				somaNumeros += numeros[linha][coluna];
			}
		}
		
		System.out.println("Valor da linha 1 e coluna 2: " + numeros [1][2]);
		
		System.out.println("Qual linha deseja ver a informação: ");
		linhaUsuario = leia.nextInt();
		System.out.println("Qual coluna deseja ver a informação: ");
		colunaUsuario = leia.nextInt();
		
		System.out.println("Informação na linha " + linhaUsuario + " e na coluna " + colunaUsuario + " tem o valor: " + numeros[linhaUsuario][colunaUsuario]);			
	}
}
