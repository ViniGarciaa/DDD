package estrutura_repeticao;

public class Ex30W {

	public static void main(String[] args) {
		int num1 = 1, num2 = 1, num3 = 1, i;
		
		i = 0;
        
        while (i <=19){
            num1 = num1 + num2  + num3;
            num2 = num1 - num2  - num3;
            num3 = num1 - num2 - num3;
            System.out.println(num2);
            i++;
        }

	}

}
