package LPA;

import java.util.Scanner;

public class Provas01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double nota1, nota2,nota3,nota4, media;
		
		System.out.print("Informe a primera nota:");
		nota1= ler.nextDouble();
		
		System.out.print("Informe a segunda nota:");
		nota2= ler.nextDouble();
		
		System.out.print("Informe a terceira nota:");
		nota3= ler.nextDouble();
		
		System.out.print("Informe a quarta nota:");
		nota4= ler.nextDouble();
		
		media=(nota1+nota2+nota3+nota4)/4;
		
		
		if (media >= 6) {
			System.out.println("Aprovado = " + media);
		}
		
		else if (media < 4) {
			System.out.println("Reprovado = " + media);
		}
		
		else {
			System.out.println("Recuperação = " + media);
		}
		}
		
		
		

	}


