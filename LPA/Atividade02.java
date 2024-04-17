package LPA;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.print("Informe o número: ");
		numero = ler.nextInt();
		
		if (numero > 0) {
			System.out.println("O numero é positivo");
		}
		else {
			System.out.println("O número é negativo");
		}
       ler.close();
   	
	}

}
