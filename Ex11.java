package estrutura_decisao;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in);
		
		int a, b, area;
		
		System.out.printf("Digite a base:");
		a = ler.nextInt();
		
		System.out.printf("Digite a altura:");
		b = ler.nextInt();
		
		area = (a * b) / 2;
		
		if (area > 100) {
			System.out.printf("Terreno Grande %d", area);
		}
	}

}