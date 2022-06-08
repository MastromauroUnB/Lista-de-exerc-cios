import java.util.Scanner;
import java.lang.Math;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fórmula de Bhaskara
		
		// Declaração das variáveis
		int a, b, c;
		double x1, x2, raiz_delta;
		
		// Criação do objeto Scanner
		Scanner leitor = new Scanner(System.in);
		
		// Leitura e armazenamento dos dados
		System.out.println("FÓRMULA DE BHASKARA");
		System.out.print("\n\nInsira o valor da letra 'a': ");
		a = leitor.nextInt();
		System.out.print("\nInsira o valor da letra 'b': ");
		b = leitor.nextInt();
		System.out.print("\nInsira o valor da letra 'c': ");
		c = leitor.nextInt();
		
		// Cálculo das raízes
		
		// raíz de delta 
		raiz_delta = Math.sqrt((b*b)-4*a*c);
		
		// Decisão a partir dos valores possíveis de delta
		if(raiz_delta > 0) {
			x1 = b*(-1) + raiz_delta;
			x1 = x1/2*a;
			x2 = b*(-1) - raiz_delta;
			x2 = x2/2*a;
			System.out.println("Há duas raízes para esse problema, com x1 = " + x1 + "e x2 = " + x2);
		}
		else if(raiz_delta == 0) {
			x1 = x2 = b*(-1) /(2*a);
			System.out.println("Há uma raiz para esse problema, em que x1 = x2 = " + x1);
		}
		else {
			System.out.println("Não há raízes reais para esse problema.");
		}
		leitor.close();
	}

}
