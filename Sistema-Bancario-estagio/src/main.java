import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

public class main {
	int receptor = 0;
	int emissor = 0;
	int senha = 0;
	
	static Scanner in = new Scanner(System.in);
	
	public static void Main(String[] args) {
		Transferencia();
		System.out.println("hello");
	}
	
	public static void Transferencia() {
		float pix, ted, doc, transferencia = 0, operador = 0;
		
		try {
			System.out.println("\nEntre com o valor de sua transf�rencia: ");
			double amount = in.nextDouble();
			if(transferencia >= 5.000) {
				System.out.println("ERRO, valor m�ximo excedido.");
				
			}
		} catch (InputMismatchException e) {
			System.out.println("Erro, resposta inv�lida.");
			
		}
		
		
		
		
		
		
		
	}
}
