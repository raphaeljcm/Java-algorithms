package edu.newton.ldp.u3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExNumerosFrequencia {

	public static void main(String[] args) {
		String alfabeto = "abcdefghijklmnopqrstuvxyz";
		String input;
		char currentCharacter = 0;
		int max = 0;
		ArrayList<String> frequencyCounter = new ArrayList<>(); 
		
		input = JOptionPane.showInputDialog("Por favor digite a frase:");
		input = input.toLowerCase();
		
		for(int i = 0; i < alfabeto.length(); i++) {			
			var counter = 0;
			var character = alfabeto.charAt(i);
			
			counter = calcularFrequencia(input, character);
			
			// vejo qual o character mais frequente
			if(counter > max) {
				max = counter;
				currentCharacter = character;
			}
			
			// salvo no Array list
			String word = character + " = " + counter;
			frequencyCounter.add(word);		
		}

		JOptionPane.showMessageDialog(null, "Letras e frequência: " + frequencyCounter);
		JOptionPane.showMessageDialog(null, "A letra que mais apareceu foi: " + currentCharacter + ". Apareceu " + max + " vezes.");
	}
	
	public static int calcularFrequencia(String input, char character) {
		var counter = 0;
		
		for(int i= 0; i < input.length(); i++) {			
			// se o caracter atual sendo testado do alfabeto estiver no input, counter++
			counter += input.charAt(i) == character ? 1 : 0; 
		}
		
		return counter;
	}
}