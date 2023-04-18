/*
Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número 
e o programa deve exibir na tela a posição deste número no vetor. 
Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.
*/

package Array;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int x, num, busca = -1;
		
		System.out.println("2, 5, 1, 3, 4, 9, 7, 8, 10, 6");
		System.out.println("Digite um número para descobrir sua posição no array: ");
		num = leia.nextInt();
		
		for (x = 0; x < 10; x++) {
			if (num == vetor [x]) {
				busca = x;
			}
		}
		
		if(busca == -1) {
			System.out.println("O número digitado " + num + " não foi encontrado!");
		}else {
			System.out.println("O número digitado " + num + " está localizado na posição " + busca);
		}
	}
}