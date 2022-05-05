package estrutura_repeticao;
import java.util.Scanner;
public class Ex28W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma, i;
			
		soma = 1;
		i = 1;
		
		while (i <=100) {
			soma = soma + i;
			i++;
		}
		System.out.printf("a soma é %d", soma);
	}

}
