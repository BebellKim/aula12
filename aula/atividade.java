package aula;

import java.util.Scanner;

public class atividade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
    	int valor, intervalo;
		
		System.out.println("Informe o valor final: ");
		valor = ler.nextInt();
		
		for (int i = 0; i <= valor; i++) {
			if (i%2!= 0) {
				System.out.println( "Números impares: " + i  );
			}
			ler.close();
		}
   }
}
