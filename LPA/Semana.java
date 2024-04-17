package LPA;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String texto, textoM;

		System.out.print("Digite o dia da semana (1-7): ");
		texto= ler.next();
		textoM=texto.toUpperCase();		

		if (textoM.equals("DOMINGO") ) {
			System.out.println("1");
			
		}

		else if (textoM.equals("SEGUNDA") ) {
			System.out.println("2");
		}

		else if (textoM.equals("TERÇA") ) {
			System.out.println("3");
		}
		else if (textoM.equals("QUARTA")) {
			System.out.println("4");
		}
		else if (textoM.equals("QUINTA")) {
			System.out.println("5");
		}
		else if (textoM.equals("SEXTA") ) {
			System.out.println("6");
		}
		else if (textoM.equals("SABADO")) {
			System.out.println("7");
		}

		else  {
			System.out.println("8");


		}

	}


}


