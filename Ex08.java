package estrutura_decisao;
import java.util.Scanner; 
public class Ex08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite um valor:");
		a = ler.nextInt();
		
		System.out.printf("digite outro valor:");
		b = ler.nextInt();
		
		if (a < b)  {
			System.out.printf("%d � maior", b);
		}else if (a > b) {
			System.out.printf("%d � maior", a);
		}
		
		
		

	}

}
