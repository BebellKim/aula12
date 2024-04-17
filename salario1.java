

import java.util.Scanner;

public class salario1 {

	public static void main(String[] args) {

		Scanner ler =  new Scanner (System.in);
		double salario, Tempo, bonus, total;

		System.out.println("Informe seu salario: ");
		salario = ler.nextDouble();

		System.out.println("Informe a quanto tempo você esta na espresa: ");
		Tempo = ler.nextDouble();

		if (Tempo <= 3) {
			bonus = (salario*0.05);
			total = (salario + bonus);
			System.out.println("O bônus é de: " + total);
		}
			else if (Tempo > 3) {
				bonus = (salario*0.07);
				total = (salario + bonus);
				System.out.println("O bônus é de: " + total);





			}

		}

	}
