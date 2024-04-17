package aula;                   
import java.util.Scanner;
public class atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double soma=0,media,numero, resultado;
		
	for (int i = 0; i <= 4; i++) {
			System.out.print("Informe os valores: ");
			numero = ler.nextInt();
			soma= soma+numero;
			System.out.println("O resultado da soma é: " + soma);
		}

		media = (soma)/5;
		System.out.println("O resultado da média é: " + media);

		ler.close();
	}
}
