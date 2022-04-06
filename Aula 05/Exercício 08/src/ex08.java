import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File arquivo = new File("C:\\Users\\09586779998\\Desktop\\Rafael-Pavelski-Desenvolvimento-Software\\Aula 05\\Exercício 08\\src\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		while(leitor.hasNext()) {
			String linha = leitor.nextLine();
//			System.out.println(linha);
			
			String[] dadoLinha = linha.split("\t");
//			System.out.println("Grupo: " + dadoLinha[0]);
//			System.out.println("Valor: " + dadoLinha[1]);
//			System.out.println("\t");
			
			if (dadoLinha[0].equals("A")) {
//				System.out.println(dadoLinha[1]);
				int valor = Integer.parseInt(dadoLinha[1]);
				System.out.println();
			}
			
			if (dadoLinha[0].equals("B")) {
				System.out.println(dadoLinha[1]);
				System.out.println();
			}
			
//			 Calcular o total por grupo
//			 Calcular o total geral
		}
		
		leitor.close();
		
	}

}
