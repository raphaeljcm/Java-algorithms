package edu.newton.ldp.u2.lab2;

import javax.swing.JOptionPane;

/**
 * Problema 2, IMC
 * @author Raphael Cardoso
 * Data: 03/09/2021
 * 
 * Descrição: Esse programa irá utilizar 2 funções fora o Main.
 * 
 * Funções() {
 * calcularImc: recebo como parâmetro a altura e o peso, elevo a altura ao quadrado
 * e retorno o cálculo do IMC, peso/altura ao quadrado.
 * 
 * resultadoFinal: após o programa passar pelo IF, todos os dados já estão formados, essa
 * função só joga na tela o IMC, a classificação e o grau de obesidade do usuário.
 * }
 * 
 * Libs: JOptionPane
 */

public class Problema2 {

	public static void main(String[] args) {
		double altura;
		double peso;
		String classificacao;
		int obesidade = 0;

		
		JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de cáculo de IMC!");
		JOptionPane.showMessageDialog(null, "IMPORTANTE! Coloque o seu número em casas decimais, ex: " +
										    " altura: 1.67 e peso 67.60");
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));

		var result = calcularImc(altura, peso);
		result = Math.round(result*100)/100; // duas casas decimais
		// Math.round arredonda o número para o inteiro mais perto
		
		if(result < 18.5) {
			classificacao = "Magreza";
		} else if(result >= 18.5 && result <= 24.9) {
			classificacao = "Normal";
		} else if(result >= 25 && result <= 29.9) {
			classificacao = "Sobrepeso";
			obesidade = 1;
		} else if(result >= 30 && result <= 39.9) {
			classificacao = "Obesidade";
			obesidade = 2;
		} else {
			classificacao = "Obesidade grave";
			obesidade = 3;
		}

		resultadoFinal(result, classificacao, obesidade);
	}
	
	private static double calcularImc(double altura, double peso) {
		var elevadoAoQuadrado = Math.pow(altura, 2);
		return peso/elevadoAoQuadrado;
	}
	
	private static void resultadoFinal(double result, String classificacao, int obesidade) {
		JOptionPane.showMessageDialog(null, "Fala ai, seu IMC é " +result+ ", sua classificação é "
									  +classificacao+ " e você está no grau " +obesidade+ " de obesidade.");
	}
}