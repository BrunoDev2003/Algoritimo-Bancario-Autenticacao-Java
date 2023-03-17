import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Iterator;

public class main {
	int receptor = 0;
	int emissor = 0;
	
	static Scanner in = new Scanner(System.in);
	
	public static void Main(String[] args) {
		Transferencia();
		System.out.println("hello");
	}
	
	public static void Transferencia() {
		float pix, ted, doc, transferencia = 0, operador = 0;
		
		try {
			System.out.println("\nEntre com o valor de sua transfêrencia: ");
			double amount = in.nextDouble();
			if(transferencia >= 5.000) {
				System.out.println("ERRO, valor máximo excedido.");
				
			}
		} catch (InputMismatchException e) {
			System.out.println("Erro, resposta inválida.");
			
		}	
		
		
		
	}
	
	public static boolean senhaValida(String senha) {
		if(senha.length() < 8) {
			return false;
		} else {
			for (int i = 0; i < senha.length(); i++) {
				if(Character.isUpperCase(senha.charAt(i))) {
					
				}
			}
			for (int q = 0; q < senha.length(); q++) {
				if(Character.isLowerCase(senha.charAt(q))) {
					
				}
			}
			for (int s = 0; s < senha.length(); s++) {
				if(Character.isDigit(senha.charAt(s))) {
					
				}
			}
			for (int c = 0; c < senha.length(); c++) {
				if(Character.)
			}
		}
		return true;
	}
}
