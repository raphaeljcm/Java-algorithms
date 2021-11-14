package edu.newton.ldp.u7.lab7.ex3;

import java.util.Scanner;

public class MainEx3 {

	/**
	 * Ex3:
	   Entrada: uma frase digitada pelo usuário
	   Saída: exibir a frase invertida usando recursão
	 */
	
	private static String inverterFrase(String frase) {
		if(frase.length() == 1) {
			// só tem uma letra na frase? retorna ela
			return frase;
		}
		
		// pego a última letra e retorno a frase sempre sem a última letra
		var novaFrase = frase.charAt(frase.length() - 1) + inverterFrase(frase.substring(0, frase.length()-1));
		
		return novaFrase;
	}

	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String frase;
		
		System.out.println("Por favor, digite uma frase:");
		frase = read.nextLine();
		read.close();
		
		System.out.println((inverterFrase(frase)));
	}
}