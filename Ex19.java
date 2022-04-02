package estrutura_decisao;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, m;
		
		System.out.printf("Informe a sua nota da p1:");
		p1 = ler.nextDouble();
		
		System.out.printf("Informe a sua nota da p2:");
		p2 = ler.nextDouble();
		
		m = (p1 + p2 + p2) / 3;
		 
		if (m >= 5) { 
			 System.out.printf("sua nota foi %.2f"
			 		+ ", portanto você foi Aprovado", m);
		}else {System.out.printf("sua nota foi %.2f"
			 		+ ", portanto você foi provado", m);
			 
		}
	}

}
