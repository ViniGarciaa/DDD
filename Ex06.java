package entrada_processamento_saida;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double dolar, real;
		
		System.out.printf("Digite o valor em d�lar:");
		dolar = ler.nextDouble();
		
		real = dolar * 5.2;
		
		System.out.printf("o valor correspondente em reais �: %.2f", real);

	}

}
