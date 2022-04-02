package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		int a, b, area;
		
		System.out.printf("digite a base:");
		a = ler.nextInt();
		
		System.out.printf("digite a altura:");
		b = ler.nextInt();
		
		area = a * b;
		
		System.out.printf("a área é: %d", area);
		
			
		
	}

}
