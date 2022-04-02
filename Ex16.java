package estrutura_decisao;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
double cata, catb, hip;
		
		System.out.printf("Informe a hipotenusa:");
		hip = ler.nextDouble();
		
		System.out.printf("Informe o cateto menor:");
		cata = ler.nextDouble();
		
		System.out.printf("Informe o cateto maior:");
		catb = ler.nextDouble();
		
		 if (hip * hip == cata * cata + catb * catb) { 
			 System.out.printf("é um triângulo retângulo");
	}

}
}
