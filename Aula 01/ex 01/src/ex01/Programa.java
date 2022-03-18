package ex01;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

//        String matricula = "12345";
//        String nome = "Emmanuelson";
//        double nota1 = 8;
//        double nota2 = 9.5;
//        double notaFinal = (nota1 + nota2) / 2;

    	Scanner leitor = new Scanner(System.in);
    	String matricula = leitor.nextLine();
    	String nome = leitor.nextLine();
    	
    	double nota1 = leitor.nextDouble();
    	
    	double nota2 = leitor.nextDouble();
    	
    	double notaFinal = (nota1 + nota2) /2;
    	
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        
        if(notaFinal >= 6) {
        	System.out.println("Aprovado: ( X ) Sim (   ) Não");
        } else {
        	System.out.println("Aprovado: (   ) Sim ( X ) Não");
        }
        
        System.out.println("Nota Final: " + notaFinal);
        
        leitor.close();
       
    }
}