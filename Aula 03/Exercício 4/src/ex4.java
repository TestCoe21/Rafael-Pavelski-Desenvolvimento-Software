import java.text.DecimalFormat;
import java.util.Scanner;

public class ex4 {

	public static void main(String [] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe a matrícula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Informe o nome:");
		String nome = leitor.nextLine();
		
		double[] notas = new double[5];
		double[] peso = new double [5];
		double[] notaPeso = new double [5];
		
		peso[0] = 0.05;
		peso[1] = 0.05;
		peso[2] = 0.2;
		peso[3] = 0.2;
		peso[4] = 0.5;
		
		int contador = 0;
		do {
			System.out.println("Informe uma nota entre 0 e 10:");
			System.out.println("Digite a " + (contador + 1) + "ª nota:");
			double temp = leitor.nextDouble();
			if (temp >= 0 && temp <= 10) {
				notas[contador] = temp;
				notaPeso[contador] = temp * peso[contador];
				contador++;
			} else {
				System.out.println("A nota " + temp + " é inválida!");
			}
		} while(contador < 5);
		
		double nFinal = notaPeso[0] + notaPeso[1] + notaPeso[2] + notaPeso[3] + notaPeso[4]; 
		
		String formato = "#.##";
		DecimalFormat d = new DecimalFormat(formato);
		
		System.out.println();
		System.out.println("---------Relatório---------");
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ":" + notas[i]);	
		}
		
		System.out.println("A soma das notas com seus respectivos pesos é igual a: " + d.format(nFinal));
		
		if( nFinal >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		leitor.close();
	}
	
}