import java.util.Scanner;
/*
 * Recebe uma velocidade máxima de uma avenida e a velocidade de um carro, para que uma
 * multa possa ser determinada a partir da diferença de velocidade
 */
public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criação do objeto scanner
		Scanner s = new Scanner(System.in);
		
		// Leitura das velocidades
		System.out.println("Qual a velocidade maxima permitida na avenida?");
		int maxima = s.nextInt();
		System.out.println("Qual a velocidade registrada no radar?");
		int radar = s.nextInt();
		
		// Cálculo da diferença
		int diferenca = radar - maxima;
		
		// Estrutura de decisão
		if(diferenca >=31) {
			System.out.println("A multa a ser dada e de 200 reais.");
		}
		else if(diferenca <= 30 && diferenca >= 11) {
			System.out.println("A multa a ser dada e de 100 reais.");
		}
		else if(diferenca <= 10 && diferenca >= 0) {
			System.out.println("A multa a ser dada e de 50 reais.");
		}
		else {
			System.out.println("Sem multa hoje B)");
		}
		
		// Scanner fechado
		s.close();
	}

}