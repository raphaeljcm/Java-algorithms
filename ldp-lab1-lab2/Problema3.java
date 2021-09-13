package edu.newton.ldp.u2.lab2;

import javax.swing.JOptionPane;

/**
 * Problema 3, Imposto de renda
 * @author Raphael Cardoso
 * Data: 03/09/2021
 * 
 * Descrição: Esse programa calcular o imposto de renda pelo salário do usuário. 
 * Usando somente uma função, fora o Main.
 * 
 * Funções() {
 * calcularIR: recebo como parâmetro o salário e o imposto calculado no IF
 * e retorno a quantidade, em reais, que o usuário irá pagar de IR.
 * }
 * 
 * Libs: JOptionPane
 */

public class Problema3 {

	public static void main(String[] args) {
		double salario;
		// apenas um teste, pois se clicar em "Cancelar" no JOptionPane, recebe nulo e joga um erro na tela
		String salarioTest = null; 
		double imposto;
		
		// corrigindo o erro do "Cancelar"
		while(true) {
			if(fixingCancelButton(salarioTest)) { // obrigar o user a colocar algum valor
				salarioTest = JOptionPane.showInputDialog("Por favor informe o seu salário: ");
			} else {
				salario = Double.parseDouble(salarioTest); // quando colocar, converto para Double
				break;
			}
		}
		
		if(salario <= 1903.98) {
			imposto = 0;
		} else if(salario >= 1903.99 && salario <= 2826.65) {
			imposto = 7.5;
		} else if(salario >= 2826.66 && salario <= 3751.05) {
			imposto = 15;
		} else if(salario >= 3751.06 && salario <= 4664.68) {
			imposto = 22.5;
		} else {
			imposto = 27.5;
		}
		
		var result = calcularIR(salario, imposto);
		
		JOptionPane.showMessageDialog(null, "Você irá pagar R$" +result+ " de IR");
	}
	
	private static double calcularIR(double salario, double imposto) {
		return salario*(imposto/100);
	}
	
	private static boolean fixingCancelButton(String salario) {
		var result = (salario == null) ? true : false;
		return result;
	}
}