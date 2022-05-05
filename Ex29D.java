package estrutura_repeticao;

public class Ex29D {

	public static void main(String[] args) {

		int num1 = 1, num2 = 0, i;
		
		i = 0;
        
		do{
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
            i++;
        }while (i <=28);
		
        

	}

}
