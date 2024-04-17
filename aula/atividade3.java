package aula;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double numero,impar=0,par=0, soma=0;
		
		for (int i = 0; i <= 9; i++) {
		System.out.println("Informe 10 números inteiros: ");
		numero = ler.nextInt();
		soma= soma+numero;
		System.out.println("O resultado da soma é: " + soma);
	
		}
		
		for (int i = 0; i <= soma; i++) {
			if (i%2!= 0) {
				System.out.println("A quantidade de números impares é: " + impar);
			}
			
			else {
				System.out.println("A quantidade de números pares é: " + par);
			}
		}
	} 
	}

