package estrutura_decisao;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double p, alt, resultado;
		char sexo;
		
		System.out.printf("Informe o sexo (m ou f):");
		sexo = (ler.next()).charAt(0);
		
		System.out.printf("Informe a altura:");
		alt = ler.nextDouble();
		
		System.out.printf("Informe o peso:");
		p = ler.nextDouble();
		
		resultado = p / (alt * alt);
		
		if (sexo == 'm') {
			if (resultado > 20 && resultado < 25)
				System.out.printf("seu peso é ideal");
			else System.out.printf("seu peso não é ideal");	
		}if (sexo == 'f') {
			if (resultado > 19 && resultado < 24)
				System.out.printf("seu peso é ideal");
		    else System.out.printf("seu peso não é ideal");
		   }
	}

}
