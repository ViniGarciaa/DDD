package estrutura_repeticao;
import java.util.Scanner;
public class Ex25W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, t, i;
		
		System.out.printf("Digite um número postivo:");
		num = ler.nextInt();
		
		while(num <=0) {
			System.out.printf("Erro! digite um número postivo:");
			num = ler.nextInt();
		}
		i = 1;
		
		while( i <= 10) {
			t = num * i;
			System.out.printf("\n %d x %d = %d", num, i, t);
			i++;
		}

}
}