package edu.newton.ldp.u5.lab.ex2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		boolean success = false;
		var password1 = new CadastroSenha();
		
		while(!success) {
			try {
				password1.password = JOptionPane.showInputDialog("Por favor digite sua senha:");
				password1.cadastrarSenha();
				success = true;
			} catch (PasswordDidNotMatch ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("Finished");
	}
}