package estrutura_repeticao;
import java.util.Scanner;
public class Ex23D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char sexo;
		
		do {
			System.out.printf("informe o seu sexo:");
			sexo = ler.next().toUpperCase().charAt(0);
		}while (sexo != 'M' && sexo != 'F');
		
		if (sexo == 'M'){
			System.out.printf("Sexo Masculino ");
			sexo = ler.next().charAt(0);
		}
		else {
			System.out.printf("O sexo é Feminino");
			sexo = ler.next().charAt(0);
		}

	}

}
