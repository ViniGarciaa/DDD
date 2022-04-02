package estrutura_decisao;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double a, v0, t, v;
		
		System.out.printf("Informe a velocidade inicial:");
		v0 = ler.nextDouble();
		
		System.out.printf("Informe a aceleração:");
		a = ler.nextDouble();
		
		System.out.printf("Informe o tempo de percurso:");
		t = ler.nextDouble();
		
		v = (v0 + a) * t;
		
		if (v <= 40) {
			System.out.printf("Veículo muito lento");
		}else if (v <= 60) {
			System.out.printf("Velocidade permitida");
		}else if (v <= 80) {
			System.out.printf("Velocidade de Cruzeiro");
		}else if (v <= 120) {
			System.out.printf("Veículo rápido")	;	
		}else if (v > 120) {
			System.out.printf("Veículo muito rápido");
		}
		

	}

}
