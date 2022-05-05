package estrutura_repeticao;
import java.util.Scanner;
public class Ex22F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
int a, b;
		
		System.out.printf("Digite o primeiro número:");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo número:");
		b = ler.nextInt();
		
		while (a >= b){
			System.out.printf("digite novamente o segundo número");
			b = ler.nextInt();
		}
		for (;a < b;) {
			System.out.printf("o segundo número é maior.");
			b = ler.nextInt();
		}

	}

}
