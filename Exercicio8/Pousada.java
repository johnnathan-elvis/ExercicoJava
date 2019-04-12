package Exercicio8;

public class Pousada {
	public static void main(String[] args) {
		
		Conta johnnathan = new Conta("johnnathan", 10);
		johnnathan.geraConta();
		Conta paulo = new Conta("Paulo", 5);
		paulo.geraConta();
		Conta.geraLucro();
	}
}