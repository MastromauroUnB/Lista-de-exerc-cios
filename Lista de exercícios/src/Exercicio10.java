
public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double soma = 0;
		int dividendo = 1;
		for(int i = 1; i < 51; i++) {
			soma += dividendo / i;
			dividendo = dividendo + 2;
		}
		System.out.println("Soma : " + soma);
	}

}
