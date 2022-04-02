package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.printf("digite o primeiro valor");
		a = ler.nextInt();
		
		System.out.printf("digite o segundo valor");
		b = ler.nextInt();
		
	   area = a * b;
	   
	   System.out.printf("a área do quadrado é: %d", area);
	}
}
