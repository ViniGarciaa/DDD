package estrutura_repeticao;
import java.util.Scanner;
public class Ex28F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma, i;
		
		soma = 1;
		
		for(i = 1; i <=100; i++) {
			soma = soma + i;			
		}
		System.out.printf("a soma é %d", soma);

	}

}
