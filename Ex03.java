package entrada_processamento_saida;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.printf("digite o primeiro valor:");
		a = ler.nextInt();
		
		System.out.printf("digite o segundo valor");
		b = ler.nextInt();
		
		area = (a * b) / 2;
 
		System.out.printf("a área é %d", area);
	}

}
