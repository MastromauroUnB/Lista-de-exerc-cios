import java.util.Scanner;
import java.lang.Math;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fórmula de Bhaskara
		
		// Declaração das variáveis
		int a, b, c;
		double x1, x2, delta;
		
		// Criação do objeto Scanner
		Scanner s = new Scanner(System.in);
		
		// Leitura e armazenamento dos dados
		System.out.println("FÓRMULA DE BHASKARA");
		System.out.print("\n\nInsira o valor da letra 'a': ");
		a = s.nextInt();
		System.out.print("\nInsira o valor da letra 'b': ");
		b = s.nextInt();
		System.out.print("\nInsira o valor da letra 'c': ");
		c = s.nextInt();
		
		// Cálculo das raízes
		
		// Delta 
		delta = Math.sqrt((b*b)-4*a*c);
		
		// Decisão a partir dos valores possíveis de delta
		if(delta > 0) {
			x1 = b*(-1) + delta;
			x1 = x1/2*a;
			x2 = b*(-1) - delta;
			x2 = x2/2*a;
			System.out.println("Há duas raízes para esse problema, com x1 = " + x1 + "e x2 = " + x2);
		}
		else if(delta == 0) {
			x1 = x2 = b*(-1) /(2*a);
			System.out.println("Há uma raiz para esse problema, em que x1 = x2 = " + x1);
		}
		else {
			System.out.println("Não há raízes reais para esse problema.");
		}
		s.close();
	}

}
