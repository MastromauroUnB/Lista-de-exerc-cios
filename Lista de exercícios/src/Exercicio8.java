import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		String nomesExtenso[] = {"Um", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez"};;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero:");
		numero = leitor.nextInt();
		if(numero <= 10 && numero > 0) {
			System.out.println("Seu numero por extenso e " + nomesExtenso[numero - 1]);
		}
		else {
			System.out.println("Nao foi possivel mostrar seu extenso");
		}
		leitor.close();
	}

}
