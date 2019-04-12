package Exercicio3;

import java.util.Scanner;

public class UsaTabuada {

	public static void main(String[] args) {

		int i = 1;
		Tabuada base = new Tabuada();

		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um da tabuada: ");

		int num = leitor.nextInt();
		base.setNum(num);
		leitor.close();

		for (; i <= 10; i++) {
			System.out.println(base.getNum() + " x " + i + " = " + (base.getNum() * i));
		}
	}

}
