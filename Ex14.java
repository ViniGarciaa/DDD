package estrutura_decisao;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, resultado;
		
		System.out.printf("Informe a altura:");
		altura = ler.nextDouble();
		
		System.out.printf("Informe o peso:");
		peso = ler.nextDouble();
		
		resultado = peso / (altura * altura);
		
		if (resultado > 18.5 && resultado < 24.9) {
				System.out.printf("seu peso é ideal");
		}
		else { System.out.printf("seu peso não é o ideal", resultado);

	     }

}
	
		
		
		
}

