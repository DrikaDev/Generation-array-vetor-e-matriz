package Array;

import java.util.Scanner;

public class Array_vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//uma dimensão: uma linha
		float [] media = new float [4];
		float n1, n2, n3, somaMedia = 0, mediaGeral = 0, maiorMedia = 0;
		int x;
		
		//vetor ou matriz, começa sempre com x = 0
		for (x = 0; x < 4; x++) {
			
			
			System.out.println("Entre com a primeira nota");
			n1 = leia.nextFloat();
			
			System.out.println("Entre com a segunda nota");
			n2 = leia.nextFloat();
			
			System.out.println("Entre com a terceira nota");
			n3 = leia.nextFloat();
			
			media [x] = (n1 + n2 + n3 / 3);
			
			somaMedia += media[x]; //somaMedia = somaMedia + media[x]
			
			if (maiorMedia < media [x]) {	
				maiorMedia = media[x];
			}
		}
		
		mediaGeral = somaMedia / 4;
		
		System.out.println("Média geral: " + mediaGeral);
		System.out.println("Maior média: " + maiorMedia);
		
		for (x = 0; x < 4; x++) {
			System.out.println("Média aluno " + x(x+1) + " foi de: " + media[x] );
		}
	}
}
