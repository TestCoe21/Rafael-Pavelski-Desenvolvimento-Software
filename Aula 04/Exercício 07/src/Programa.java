import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\09586779998\\Desktop\\Rafael-Pavelski-Desenvolvimento-Software\\Aula 04\\Exercício 07\\src\\alunos.csv");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		Aluno[] alunos = new Aluno[5];
		int contador = 0;
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
			String[] dados = linha.split(";");
			String matricula = dados[0];
			String nome = dados[1];
			String nota1 = dados[2];
			String nota2 = dados[3];
			String nota3 = dados[4];
			
			Aluno aluno = new Aluno();
			aluno.matricula = matricula;
			aluno.nome = nome;
			aluno.nota1 = Double.parseDouble(nota1);
			aluno.nota2 = Double.parseDouble(nota2);
			aluno.nota3 = Double.parseDouble(nota3);
			
			alunos[contador] = aluno; 
			contador++;
		}

				
		/*
		 * Aluno aluno1 = new Aluno(); aluno1.matricula = "12345"; aluno1.nome =
		 * "Klebinho Maratonista"; aluno1.nota1 = 7.8; aluno1.nota2 = 5.6; aluno1.nota3
		 * = 6.5;
		 * 
		 * Aluno aluno2 = new Aluno(); aluno2.matricula = "12543"; aluno2.nome =
		 * "Serginho do Pneu"; aluno2.nota1 = 7.7; aluno2.nota2 = 4.2; aluno2.nota3 =
		 * 5.8;
		 * 
		 * Aluno[] alunos = new Aluno[2]; alunos[0] = aluno1; alunos[1] = aluno2;
		 */
		
		 for (int i = 0; i < alunos.length; i++) {
		 Aluno a = alunos[i];
		 System.out.println("Matrícula: " + a.matricula); System.out.println("Nome: " + a.nome); System.out.println("Nota 1: " + a.nota1);
		 System.out.println("Nota 2: " + a.nota2); System.out.println("Nota 3: " + a.nota3); System.out.println(); }
		 
		leitor.close();
		
	}
	
}