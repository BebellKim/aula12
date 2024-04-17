package LPA;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		String login, senha, l, s;
		
		
		System.out.println("Vamos iniciar seu cadastro!"); 
		
		
		System.out.print("Cadastre seu login: ");
		login = ler.next();
		
		System.out.print("Cadastre sua senha: ");
		senha= ler.next();
		
		System.out.println("Seu cadastro está concluído!"); 
		
		System.out.println("-------------------------------------"); 
		
		System.out.print("Informe seu login: ");
		l = ler.next();
		
		System.out.print("informe sua senha: ");
		s= ler.next();
		
		if (login.equals(l) && senha.equals(s)) {
		  System.out.print("Bem-Vindo ao Sistema Senai!");	
		}
		
		else {
			System.out.print("Dados Incorretos, informe os dados novamente");
		}
	
		
		
		
	}

}
