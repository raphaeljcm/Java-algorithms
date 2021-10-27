package edu.newton.ldp.u5.lab.ex2;

import javax.swing.JOptionPane;

public class PasswordDidNotMatch extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PasswordDidNotMatch(Integer valor, String operacao) {
		super("I'm sorry, password didn't match.");
		
		if(operacao == "Op1") {
			JOptionPane.showMessageDialog(null, "Tamanho mínimo 8 e tamanho máximo 12. Tente novamente.");
		}
		
		if(operacao == "Op2") {
			JOptionPane.showMessageDialog(null, "Mínimo uma letra maiúscula. Tente novamente.");
		}
		
		if(operacao == "Op3") {
			JOptionPane.showMessageDialog(null, "Mínimo um dígito (0-9). Tente novamente.");
		}
		
		if(operacao == "Op4") {
			JOptionPane.showMessageDialog(null, "Mínimo um dos símbolos (!@#?). Tente novamente.");
		}
		
		if(operacao == "Op5") {
			JOptionPane.showMessageDialog(null, "Não pode haver repetições. Tente novamente.");
		}
		
		if(operacao == "Op6") {
			JOptionPane.showMessageDialog(null, "Não pode haver espaços. Tente novamente.");
		}
	}
}
