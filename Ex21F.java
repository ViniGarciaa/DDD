package estrutura_repeticao;
import java.util.Scanner;
public class Ex21F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um n�mero positivo:");
		num = ler.nextInt();
		
		while (num <= 0) {
			System.out.printf("Erro, o n�mero deve ser positivo");
			num = ler.nextInt();			
		}
		
		for (;num > 0;) {
			System.out.printf("Sucesso! o n�mero � positivo.");
			num = ler.nextInt();
		}

	}

}
