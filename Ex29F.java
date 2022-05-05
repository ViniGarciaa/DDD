package estrutura_repeticao;

public class Ex29F {

	public static void main(String[] args) {
			
			int num1 = 1, num2 = 0, i;
	        
	        for(i= 0; i <=28; i++){
	            num1 = num1 + num2;
	            num2 = num1 - num2;
	            System.out.println(num1);
	        }
			

		}

	}
