package edu.newton.ldp.u5.lab.ex3;

import javax.swing.JOptionPane;

public class CpfInvalido extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CpfInvalido(String operacao) {
		super("Me desculpe, cpf inválido!");
		
		if(operacao == "Error1") {
			JOptionPane.showMessageDialog(null, "CPF não pode ter sequência de números iguais e deve ser 11 números.");
		}
		
		if(operacao == "Letters") {
			JOptionPane.showMessageDialog(null, "CPF não tem letra amigo");
		}
		
		if(operacao == "Error2") {
			JOptionPane.showMessageDialog(null, "Número não pode ser menor que 0 ou maior que 9");
		}
		
		if(operacao == "Error3") {
			JOptionPane.showMessageDialog(null, "Código 1 inválido!");
		}
		
		if(operacao == "Error4") {
			JOptionPane.showMessageDialog(null, "Código 2 inválido!");
		}
	}
}
