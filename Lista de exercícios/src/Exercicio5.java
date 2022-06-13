import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usuario = 1234;
		int senha = 9999;
		int entrada = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		
		while(entrada != usuario) {
			System.out.println("Digite o user:");
			entrada = leitor.nextInt();
			if(entrada != usuario) {
				System.out.println("Usuario invalido.");
			}
		}
		while(entrada != senha) {
			System.out.println("Digite a senha:");
			entrada = leitor.nextInt();
			if(entrada != senha) {
				System.out.println("Senha incorreta.");
			}
		}
		System.out.println("Acesso permitido.");
	}

}
