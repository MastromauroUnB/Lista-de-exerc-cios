import java.util.Scanner;
public class Exercico11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maiorAltura, menorAltura, posMenorAltura, posMaiorAltura;
		Scanner leitor = new Scanner(System.in);
		String numAlunosRecebido, alturaAlunosRecebido;
		System.out.println("Digite os numeros dos alunos, separando-os somente por ';'.");
		numAlunosRecebido = leitor.next();
		String numAlunos[] = numAlunosRecebido.split(";");
		System.out.println("Digite as alturas dos alunos, separando-as somente por ';'.");
		alturaAlunosRecebido = leitor.next();
		String alturaAlunos[] = alturaAlunosRecebido.split(";");
		menorAltura = maiorAltura = Integer.parseInt(alturaAlunos[0]);
		posMenorAltura = posMaiorAltura = 0;
		for(int i = 1; i < alturaAlunos.length; i++) {
			if(menorAltura > Integer.parseInt(alturaAlunos[i])){
				menorAltura = Integer.parseInt(alturaAlunos[i]);
				posMenorAltura = i;
			}
			if(maiorAltura < Integer.parseInt(alturaAlunos[i])){
				maiorAltura = Integer.parseInt(alturaAlunos[i]);
				posMaiorAltura = i;
			}
		}
		System.out.println("Menor altura: " + menorAltura + ". Aluno: " +  numAlunos[posMenorAltura]);
		System.out.println("Maior altura: " + maiorAltura + ". Aluno: " +  numAlunos[posMaiorAltura]);
	}

}
