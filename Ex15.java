package estrutura_decisao;
import java.util.Scanner;
public class Ex15 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.printf("Informe o primeiro lado:");
		a = ler.nextDouble();
		
		System.out.printf("Informe o segundo lado:");
		b = ler.nextDouble();
		
		System.out.printf("Informe o terceiro lado:");
		c = ler.nextDouble();
		
		 if (a > b + c ||
			b > a + c ||
			c > a + b) { 
				System.out.printf("não é um triângulo.");
		}else if (a == b && b == c) {
			System.out.printf("é um triângulo, é equilátero");
		}else if 
		    (a != b && a == c|| 
			a != c && a == b ||
			b != a && b == c ||
			b != c && b == a ||
			c != a && c == b ||
		    c != b && c == a){
			System.out.printf("é um triângulo, é isócecles");
		}else if (a != b && b != c)
			System.out.printf("é um triângulo, é escaleno");
			
		
		
		

}
}