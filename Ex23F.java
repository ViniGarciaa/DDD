package estrutura_repeticao;
import java.util.Scanner;
public class Ex23F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char sexo;
		
		System.out.printf("Informe o seu sexo:");
		sexo = ler.next().toUpperCase().charAt(0);
		
		for (;(sexo != 'M')&&(sexo != 'F');) {
			
			System.out.printf("informe um sexo v�lido:");
			sexo = ler.next().toUpperCase().charAt(0);
		}
		if (sexo == 'M'){
			System.out.printf("Sexo Masculino ");
			sexo = ler.next().charAt(0);
		}
		else {
			System.out.printf("O sexo � Feminino");
			sexo = ler.next().charAt(0);
		}

	}

}
