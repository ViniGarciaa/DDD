package entrada_processamento_saida;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, e, pagamento, troco;
		
		System.out.printf("digite o valor do primeiro produto:");
		a = ler.nextDouble();
		
		System.out.printf("digite o valor do segundo produto:");
		b = ler.nextDouble();
		
		System.out.printf("digite o valor do terceiro produto:");
		c = ler.nextDouble();
		
		System.out.printf("digite o valor do quarto produto:");
		d = ler.nextDouble();
		
		System.out.printf("digite o valor do quinto produto:");
		e = ler.nextDouble();
		
		System.out.printf("digite o valor do pagamento:");
		pagamento = ler.nextDouble();
		
		troco = pagamento - (a + b + c + d + e);
		
		System.out.printf("Seu troco é: %.2f", troco);

	}

}
