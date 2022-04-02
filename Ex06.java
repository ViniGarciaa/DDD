package entrada_processamento_saida;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dolar, real;
		
		System.out.printf("Digite o valor em dólar:");
		dolar = ler.nextDouble();
		
		real = dolar * 5.2;
		
		System.out.printf("o valor correspondente em reais é: %.2f", real);

	}

}
