package Exercicio2;

import java.util.Scanner;

public class Par {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int valor = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("infomre um valor\n");
			valor = leitor.nextInt();
			if (valor % 2 == 0) {
				System.out.println("Par");
			} else
				System.out.println("Impar");
		}
		leitor.close();
	}

}
