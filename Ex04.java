package entrada_processamento_saida;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, media;
	
		
		System.out.printf("digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.printf("digite o terceiro valor: ");
		c = ler.nextDouble();
		
		System.out.printf("digite o quarto valor: ");
		d = ler.nextDouble();
		
		media = (a + b + c + d) / 4;
		
		System.out.printf("a média é %.2f", media);
		
		

	}

}
