package Exercicio7;

public class AvaliaAluno {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("aluno1", 10, 9);
		Aluno aluno2 = new Aluno("aluno2", 6, 6);
		Aluno aluno3 = new Aluno("aluno3", 8, 9);
		Aluno aluno4 = new Aluno("aluno4", 7, 7);
		Aluno aluno5 = new Aluno("aluno5", 2, 3);
		Aluno aluno6 = new Aluno("aluno6", 6, 6);

		aluno1.fazerMedia();
		aluno2.fazerMedia();
		aluno3.fazerMedia();
		aluno4.fazerMedia();
		aluno5.fazerMedia();
		aluno6.fazerMedia();
		
		aluno1.avalia();
		aluno2.avalia();
		aluno3.avalia();
		aluno4.avalia();
		aluno5.avalia();
		aluno6.avalia();
		
		Aluno.informa();
	}
}


