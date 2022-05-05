package estrutura_repeticao;

public class Ex29W {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 0, i;
		
		i = 0;
        
        while (i <=28){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
            i++;
        }
		

	}

}
