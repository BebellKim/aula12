package LPA;

import java.util.Scanner;

public class atividade03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double numero1, numero2, numero3;
		
		System.out.print("Informe o primeiro número: ");
        numero1= ler.nextInt();
        
        System.out.print("Informe o segundo número: ");
        numero2= ler.nextInt();
        
        System.out.print("Informe o terceiro número: ");
        numero3= ler.nextInt();
        
        if (numero1>numero2 && numero1>numero3) {
        	System.out.println("O maior número é " + numero1);
        }
        else if (numero2>numero1 && numero2>numero3) {
        	System.out.println("O maior número é " + numero2);
        }
        else if (numero1==numero2 && numero2==numero3)
        	System.out.println("Todos os números são iguais");
        
        else {
        	System.out.println("O maior número é " + numero3);
        }
        
        // MENOR NÚMERO
      
        if (numero1<numero2 && numero1<numero3) {
        	System.out.println("O menor número é " + numero1);
        }
        else if (numero2<numero3) {
        	System.out.println("O menor número é " + numero2);
        }
        
        
        else {
        	System.out.println("O menor número é " + numero3);
        }
	}
}
        
      
        


