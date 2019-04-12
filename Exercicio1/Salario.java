package Exercicio1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		float salario;
		float aumento;
		float novosalario;

		Scanner leitor = new Scanner(System.in);
		System.out.println("digite seu salario\n");
		salario = leitor.nextFloat();

		System.out.println("digite o aumento\n");
		aumento = leitor.nextFloat();

		aumento = aumento / 100;
		novosalario = salario + (salario * aumento);

		System.out.println("seu salario atual é: " + novosalario);

		leitor.close();
	}

}
