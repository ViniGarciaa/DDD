package estrutura_repeticao;

import java.util.Scanner;

public class Ex31D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i=0, ter=3, num=2;
		
		do {
			System.out.printf("Digite um número positivo menor que 100");
			n = ler.nextInt();
		}while (n<0 || n>100);
		
		do {
				num = num + ter;
				ter = ter+2;
				System.out.println(num);
				i++;
				
		}while(i<n);
		
	}

}
