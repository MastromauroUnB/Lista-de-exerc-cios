import java.util.Scanner;
/*
 * Recebe uma velocidade máxima de uma avenida e a velocidade de um carro, para que uma
 * multa possa ser determinada a partir da diferença de velocidade
 */
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criação de variáveis
		int vMaxima, vRadar, diferenca;
		
		// Criação do objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		// Leitura das velocidades
		System.out.println("Qual a velocidade maxima permitida na avenida?");
		vMaxima = leitor.nextInt();
		System.out.println("Qual a velocidade registrada no radar?");
		vRadar = leitor.nextInt();
		
		// Cálculo da diferença
		diferenca = vRadar - vMaxima;
		
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
		leitor.close();
	}

}