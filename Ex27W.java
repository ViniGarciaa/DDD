package estrutura_repeticao;
import java.util.Scanner;
public class Ex27W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
       int num, t, i;
		
		num = 1;
		
		while( num <= 20) {
			i = 1;			
			System.out.printf("aperte uma número qualquer");
			t = ler.nextInt();
		
			while( i <= 10) {
				t = num * i;
				System.out.printf("\n %d x %d = %d", num, i, t);
				i++;
			}
		num++;
	
	}

}
}
