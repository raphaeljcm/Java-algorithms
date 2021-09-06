package edu.newton.ldp.u2.lab2;

import javax.swing.JOptionPane;

/**
 * Problema 1, Números Primos
 * @author Raphael Cardoso
 * Data: 03/09/2021
 * 
 * Descrição: Esse programa irá retornar, pelo número digitado pelo usuário, se é ou não um número primo.
 * Irá utilizar 1 função, fora o Main.
 * 
 * Funções() {
 * 	isPrime: recebe o número digitado e faz uma lógica simples para saber se o número é primo ou não,
 * 	retornando boolean, falso ou verdadeiro.
 * }
 * 
 * Libs: JOptionPane
 */

public class Problema1 {

	public static void main(String[] args) {
		int number;
		
		number = Integer.parseInt(JOptionPane.showInputDialog("Type here a number: "));
		
		var result = isPrime(number);
		
		JOptionPane.showMessageDialog(null, result?"This is a prime number.":"This isn't a prime number.");
	}
	
	private static boolean isPrime(int number) {
		// Primo: somente é divisível por 1 e ele mesmo
		
		// FOR: começo o contator do 2, para já cortar o 1 e termino o for antes do próprio número
		// ou seja, todas as possibilidades de ser primo já estão fora
		for(int i = 2; i < number; i++) {
			if(number % i == 0) { // se o resto aqui for igual a 0, não é primo
				return false;
			}
		}
		return true;
	}
}