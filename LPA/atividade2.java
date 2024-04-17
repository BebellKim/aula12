package LPA;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		String turno, M, V, N;
		
		System.out.println("Em qual turno você estuda?" );
		System.out.println("Se matutino digite M" );
		System.out.println("Se vespertino digite V" );
		System.out.println("Se noturno digite N" );
		
		System.out.println("                              " ); // espaço entre as informações
		
		System.out.print("Informe aqui: " );
		turno = ler.next();
		
		if (turno.equals("M")|| turno.equals("m")) {
			System.out.print("Bom Dia!" );
		}
		else if (turno.equals("V")|| turno.equals("v") ) {
			System.out.print("Boa Tarde!" );
		}
		else if (turno.equals("N")||turno.equals("n") ) {
			System.out.print("Boa Noite!" );
		}
		
		else {
			System.out.print("Valor Inválido!" );
		}	

	}

}
