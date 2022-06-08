import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaração de variáveis
		String consoantes = "bcdfghjklmnpqrstvwxyz";
		String vogais = "aeiou";
		String numerais = "0123456789";
		char digito;
		
		// Criação do Scanner
		Scanner s = new Scanner(System.in);
		
		// Código
		
		// Leitura do caractere
		System.out.print("Digite um caracere qualquer: ");
		digito = s.next().charAt(0);
		
		// Estrutura de decisão (converte o caractere em uma string em minúsculo).
		if(consoantes.contains(Character.toString(digito).toLowerCase())) {
			System.out.println("O caractere é uma consoante.");
		}else if(vogais.contains(Character.toString(digito).toLowerCase())) {
			System.out.println("O caractere é uma vogal.");
		}else if(numerais.contains(Character.toString(digito).toLowerCase())) {
			System.out.println("O caractere é um numeral.");
		}else {
			System.out.println("O caractere é um caractere especial");
		}
		s.close();
	}

}
