
public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grausFahrenheit, grausCelsius;
		
		System.out.println("Graus Celsius | Graus Fahrenheit");
		for(int i = 50; i < 66; i++) {
			grausCelsius = i;
			grausFahrenheit = grausCelsius * 9;
			grausFahrenheit = grausFahrenheit/5 + 32;
			System.out.println(i + "              " + grausFahrenheit);
		}
	}

}
