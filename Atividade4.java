/*
Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. 
As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, 
logo cada linha da matriz serão as notas de um participante. 
Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.
*/

package Array;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double [][]nota = new double[10][4];
		double [] media = new double [10];
		int linha, coluna;
		
		//Digitar as notas dos alunos:
		for (linha = 0; linha < 10; linha ++) {
			
			System.out.println("Digite as notas do(a) aluno(a) nº " + (linha +1) + ":");
			
			for (coluna = 0; coluna < 4; coluna ++ ) {
				
				System.out.print("Nota " + (coluna +1) + ": ");
				nota[linha][coluna] = leia.nextDouble();
			}
		}
		
		//Calcular a média:
		for (linha = 0; linha < 10; linha ++) {
			float soma = 0;
			for(coluna = 0; coluna < 4; coluna++) {
				soma += soma + nota[coluna][linha];
			}
			media[linha] = soma / 4;
		}
		
		//Mostrar a média:
		for (linha = 0; linha < 10; linha ++) {
			System.out.println("A média do aluno " + (linha + 1) + " é:" + media[linha] );
		}
	}
}
