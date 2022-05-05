package estrutura_repeticao;
import java.util.Scanner;
public class Ex24F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, t, i;
		
		System.out.printf("Digite o número 5:");
		num = ler.nextInt();
		
		while(num != 5) {
			System.out.printf("Erro, digite o número 5");
			num = ler.nextInt();
		}
		for (i=1; i<=10; i++) {
			t = num * i;
			System.out.printf("\n%d x %d = %d", num, i, t);
		}
	}

}
