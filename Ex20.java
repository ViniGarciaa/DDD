package estrutura_decisao;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, m;
		
		System.out.printf("Informe a sua nota da p1:");
		p1 = ler.nextDouble();				
		
		m = 5;
		
		p2 = (5 * 3 - p1) / 2;				
		
		System.out.printf("você precisa de %.2f para ser "
			 		+ "aprovado", p2);
				
		  
		
			 
			 
		
	}

}
