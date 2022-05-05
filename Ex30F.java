package estrutura_repeticao;

public class Ex30F {

	public static void main(String[] args) {
		int num1 = 1, num2 = 1, num3 = 1, i;
		
		for(i= 0; i <=19; i++){
			num1 = num1 + num2  + num3;
            num2 = num1 - num2  - num3;
            num3 = num1 - num2 - num3;
            System.out.println(num2);
		}
	}

}
