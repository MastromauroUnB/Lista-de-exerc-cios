import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, qtdeDivisores;
		qtdeDivisores = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero:");
		numero = leitor.nextInt();
		for(int i = numero; i > 0; i--) {
			if(numero%i == 0) {
				qtdeDivisores++;
			}
		}
		if(qtdeDivisores > 2) {
			System.out.println("Nao e primo");
		}
		else {
			System.out.println("Primo");
		}
	}

}
