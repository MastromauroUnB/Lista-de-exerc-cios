import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String nome;
		 int qtde;
		 double precoUnitario, total, totalDescontado;
		 
		 Scanner leitor = new Scanner(System.in);
		 
		 System.out.println("Digite o nome do produto");
		 nome = leitor.next();
		 System.out.println("Digite a quantidade comprada");
		 qtde = leitor.nextInt();
		 System.out.println("Digite o preco unitario");
		 precoUnitario = leitor.nextDouble();
		 total = precoUnitario * qtde;
		 if(qtde <= 5) {
			 totalDescontado = total - total*0.02;
		 }
		 else if(qtde <= 10) {
			 totalDescontado = total - total*0.03;
		 }
		 else {
			 totalDescontado = total - total*0.05;
		 }
		 System.out.println("O preco total de " + qtde + " unidades de " + nome + " sem desconto é de " + total);
		 System.out.println("O preco total de " + qtde + " unidades de " + nome + " com desconto é de " + totalDescontado);
		 leitor.close();
	}

}
