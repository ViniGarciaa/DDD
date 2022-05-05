package estrutura_repeticao;
import java.util.Scanner;
public class Ex28D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma, i;
		
		soma = 1;
		i = 1;
		
		do {
			soma = soma + i;
			i++;
		}
		while(i <=100);
		
		System.out.printf("a soma é %d", soma);
	}
	

}
