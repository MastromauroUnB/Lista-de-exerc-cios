import java.util.Scanner;


public class Exercicio4 {
	public static void main(String[] args) {
		
		// Declaração de variáveis
		String data1, data2;
		
		// Criação do objeto Scanner
		Scanner leitor = new Scanner(System.in);
		
		// Leitura dos valores das variáveis
		System.out.println("Digite uma data no formato DD/MM/AAAA, incluindo zeros:");
		data1 = leitor.next();
		System.out.println("Digite outra data no formato DD/MM/AAAA, incluindo zeros:");
		data2 = leitor.next();
		
		// Comparação das datas
		// Em ordem: ano (substring de 6 a 10), mês, dia
		
		// Ano
		if(Integer.parseInt(data1.substring(6, 10)) > Integer.parseInt(data2.substring(6,10))) {
			System.out.println(data1.substring(6, 10) + " " + data2.substring(6, 10) +"  1 > 2");
		}
		else if(Integer.parseInt(data1.substring(6, 10)) < Integer.parseInt(data2.substring(6,10))) {
			System.out.println(data1.substring(6, 10) + " " + data2.substring(6, 10) +"  1 < 2");
		}
		// Mês
		else if(Integer.parseInt(data1.substring(3, 5)) > Integer.parseInt(data2.substring(3,5))) {
			System.out.println(data1.substring(3, 5) + " " + data2.substring(3, 5) +"  1 > 2");
		}
		else if(Integer.parseInt(data1.substring(3, 5)) < Integer.parseInt(data2.substring(3,5))) {
			System.out.println(data1.substring(3, 5) + " " + data2.substring(3, 5) +"  1 < 2");
		}
		// Dia
		else if(Integer.parseInt(data1.substring(0, 2)) > Integer.parseInt(data2.substring(0,2))) {
			System.out.println(data1.substring(0, 2) + " " + data2.substring(0, 2) +"  1 > 2");
		}
		else if(Integer.parseInt(data1.substring(0, 2)) < Integer.parseInt(data2.substring(0,2))) {
			System.out.println(data1.substring(0, 2) + " " + data2.substring(0, 2) +"  1 < 2");
		}
		else {
			System.out.println("Datas iguais.");
		}
		
		// Scanner fechado
		leitor.close();
	}
}
