import java.util.Scanner;


public class Atividade05 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("digite uma palavra : ");
		String palavra =scan.next();
		String palavraInvertida="";
		for(int i =palavra.length()-1;i>=0; i--) {
			palavraInvertida= palavraInvertida + Character.toString(palavra.charAt(i));
		}
			System.out.println(palavraInvertida);
	}

}
