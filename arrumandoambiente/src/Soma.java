import java.util.Scanner;

public class Soma {
	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n?mero: ");
		int num1 = entrada.nextInt();
		System.out.print("Digite o segundo n?mero: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Resultado: " + somar(num1, num2));
		entrada.close();
	}
}
