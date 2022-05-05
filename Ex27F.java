package estrutura_repeticao;
import java.util.Scanner;
public class Ex27F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
       int num, t, i;
       
       System.out.printf("aperte uma tecla:");
		num = ler.nextInt();
		
		while( num<=20) {
			for(i = 1 ; i <=10; i++){
				t = num * i;
				System.out.printf("\n %d x %d = %d", num, i, t);
		}
		num++;
		System.out.printf("aperte uma número qualquer");
		t = ler.nextInt();
	}

}
}
