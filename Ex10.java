package estrutura_decisao;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, iguais;
		
		System.out.printf("Digite um valor:");
		a = ler.nextInt();
		
		System.out.printf("Digite outro valor:");
		b = ler.nextInt();
		
		if (a < b) {
			System.out.printf("%d é maior", b);
		}else if (a > b) {
			System.out.printf("%d é maior", a);
		}else if (a == b) {
			System.out.printf("os valores são iguais");
		}
	}   

}
