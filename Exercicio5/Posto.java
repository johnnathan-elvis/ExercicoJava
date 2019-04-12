package Exercicio5;

import java.util.Scanner;

public class Posto {
	public static void main(String[] args) {

		Itens motorista = new Itens();

		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a quantidade de gasolina em litros: ");
		float gas = leitor.nextFloat();
		motorista.setGasolina((float) gas);

		motorista.gerarConta();

		leitor.close();
	}

}
