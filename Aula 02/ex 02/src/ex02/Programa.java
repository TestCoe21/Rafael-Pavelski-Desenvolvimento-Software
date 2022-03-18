package ex02;

import java.util.Scanner;

public class Programa {

public static void main(String[] args) {
		
		int len = 1;
		String[] matriculas = new String[len];
		String[] nomes = new String[len];
		double[][] notas = new double[len][2];
		String aprovado = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i < len; i++) {
			System.out.println("Aluno " + (i + 1));
			System.out.print("Informe matrícula: ");

			matriculas[i] = scan.next();
			
			System.out.print("Informe nome do aluno: ");
			nomes[i] = scan.next();
			
			System.out.print("Informe a nota 1: ");
			notas[i][0] = scan.nextDouble();
			
			System.out.print("Informe a nota 2: ");
			notas[i][1] = scan.nextDouble();
		}
		
		scan.close();
		
		
		for(int i = 0; i < len; i++) {
			double media = (notas[i][0] + notas[i][1]) / 2;	
	        aprovado = "Aprovado: " + ((media >= 6) ? "( X ) Sim (  ) Nao": "(  ) Sim ( X ) Nao");
	       
	        String resultado = "Matrícula: " + matriculas[i];
	        resultado += "\nNome: " + nomes[i];
	        resultado += "\n" + aprovado;
	        resultado += "\nNota Final: " + media; 			
	        System.out.println(resultado);
		}
	
	}
	
}
