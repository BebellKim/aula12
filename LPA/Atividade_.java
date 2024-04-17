package LPA;

import java.util.Scanner;

public class Atividade_ {

	public static void main(String[] args) {

		//Variável
		String frase;
		String comparativo="olá mundo";

		int caractere;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a frase:");
		frase = ler.nextLine();

		int tamanho = frase.length (); 
		System.out.println("Tamanho da frase: " + tamanho);

		System.out.println("informe o caractere na posição desejadas: ");
		caractere =ler.nextInt();

		char letra = frase.charAt(caractere);
		System.out.println("O caractere: " + letra);

		boolean comparacao = frase.equals(comparativo);
		System.out.println ("A comparação é: " + comparacao);

	}



}


