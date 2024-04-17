package aula;

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n, resultado;
	
	System.out.print("Informe um número para tabuada: ");
	n= ler.nextInt();
	

	for (int i = 0; i <= 10; i++) {
		resultado=n*i;
		System.out.println(n +"x" + i + "=" +resultado);




	}
	ler.close();
}
}


