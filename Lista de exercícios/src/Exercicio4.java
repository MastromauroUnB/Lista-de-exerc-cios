import java.util.Scanner;


public class Exercicio4 {
	public static void main(String[] args) {
		
		// Declaração de variáveis
		String data1, data2;
		
		// Criação do objeto Scanner
		Scanner leitor = new Scanner(System.in);
		
		// Leitura dos valores das variáveis
		System.out.println("Digite uma data no formato DD/MM/AAAA");
		data1 = leitor.next();
		System.out.println("Digite outra data no formato DD/MM/AAAA");
		data2 = leitor.next();
		
		// Comparação das datas
		// Em ordem: ano, mês, dia
		if(Integer.parseInt(data1.substring(6, 10)) > Integer.parseInt(data2.substring(6,10))) {
			System.out.println(data1.substring(6, 10) + " " + data2.substring(6, 10) +"  1 < 2");
		}
	}
}
