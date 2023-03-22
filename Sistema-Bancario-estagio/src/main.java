import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		
		if (senha == null) {
			return false;
		}
		
		Matcher m = p.matcher(senha);
		
		return m.matches();
	}
}
