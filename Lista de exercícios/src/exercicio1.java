import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Qual a velocidade m�xima permitida na avenida?");
		int maxima = s.nextInt();
		System.out.println("Qual a velocidade registrada no radar?");
		int radar = s.nextInt();
		int diferenca = radar - maxima;
		if(diferenca >=31) {
			System.out.println("A multa a ser dada é de 200 reais.");
		}else if(diferenca <= 30 && diferenca >= 11) {
			System.out.println("A multa a ser dada é de 100 reais.");
		}else if(diferenca <= 10 && diferenca >= 0) {
			System.out.println("A multa a ser dada é de 50 reais.");
		}else {
			System.out.println("Sem multa hoje B)");
		}
		s.close();
	}

}
