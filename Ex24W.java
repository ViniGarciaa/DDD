package estrutura_repeticao;
import java.util.Scanner;
public class Ex24W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, t, i;
		
		System.out.printf("Digite o n�mero 5:");
		num = ler.nextInt();
		
		while(num != 5) {
			System.out.printf("Erro, digite o n�mero 5");
			num = ler.nextInt();
		}
		i = 1;
		
		while (i <= 10) {
			t = num * i;
			System.out.printf("\n%d x %d = %d", num, i, t );
			i++;
			
		}
	}

}
