package entrada_processamento_saida;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double celsius, farenheit;
		
		System.out.printf("digite a temperatura em celsius:");
		celsius = ler.nextDouble();
		
		farenheit = celsius * 1.8 + 32;
		
		System.out.printf("A temperatura em Farenheit é: %.2f", farenheit);

	}

}
