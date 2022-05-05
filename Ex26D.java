package estrutura_repeticao;
import java.util.Scanner;
public class Ex26D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, t;
		
		System.out.printf("Digite um número postivo:");
		a = ler.nextInt();
		
		System.out.printf("Digite um número postivo:");
		b = ler.nextInt();
		
		do {
			System.out.printf("Erro! digite um número postivo:");
			a = ler.nextInt();
		}
		while(a <=0 && b <= 0);
		
		do {
			System.out.printf("B deve ser maior do que A, digite B novamente:");
			b = ler.nextInt();
		}
		while (b <= a);
		
		do {
			t = b * a;
			System.out.printf("\n %d x %d = %d", b, a, t);
			b--;
		}
		while(b <=10 && b >= 0);
	}

}

