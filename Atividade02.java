

public class Atividade02 {

	public static void main(String[] args) {
		int a =1;
		int b= 0;
		int aux;
		
		for(int i =0;i<30;i++) {
			System.out.println(a);
			aux=a;
			a=a+b;
			b=aux;
			int fib=a;
			
			if(fib==a) {
				System.out.println(" é sequência de Fibonacci");
			 
			}else {
				System.out.println("não é sequência");
			}
		
		}
}
}