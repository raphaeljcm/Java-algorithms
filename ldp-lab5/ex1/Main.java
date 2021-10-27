package edu.newton.ldp.u5.lab.ex1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws numeroNegativoException, letrasException {
		int qtd = 0;
		boolean success = false;
	
		while(!success) {
			try {
				qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números quer digitar?"));
				
				if(qtd > 0) {
					int vetor[] = new int[qtd];
					
					for(int i = 0; i < vetor.length; i++) {
						int number;
						String aux;
						
						aux = JOptionPane.showInputDialog(null, "Insira um número:");
						
						if(!aux.matches(".*[0-9].*")) {
							throw new letrasException();
						} else {
							number = Integer.parseInt(aux);
							
							vetor[i] = number;
						}				
					}
					System.out.println("Seus números: " + Arrays.toString(vetor));
					success = true;
				} else {
					throw new numeroNegativoException();
				}	
			} catch(numeroNegativoException ex) {
				System.out.println(ex.getMessage());
			} catch(letrasException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("Terminou!");
	}
}