package estrutura_repeticao;
import java.util.Scanner;
public class Ex27D {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
       int num, t, i;
       	
		num = 1;
	
	do {i = 1;			
		System.out.printf("aperte uma número qualquer");
		t = ler.nextInt();
			do {
				t = num * i;
				System.out.printf("\n %d x %d = %d", num, i, t);
				i++;
			}while( i <= 10);
			num++;
	
	
	}while( num <= 20);
		
	
	}

}
