package estrutura_repeticao;
import java.util.Scanner;
public class Ex22D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
int a, b;
		
		System.out.printf("Digite o primeiro n�mero:");
		a = ler.nextInt();
		
		do {
			System.out.printf("Digite o segundo n�mero:");
			b = ler.nextInt();
		}while (a >= b);
		
		do {
			System.out.printf("o segundo n�mero � maior.");
			a = ler.nextInt();
		}while (a < b);
		

	}

}
