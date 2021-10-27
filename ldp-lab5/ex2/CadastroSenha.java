package edu.newton.ldp.u5.lab.ex2;

import javax.swing.JOptionPane;

public class CadastroSenha {
	String password;
	
	public void cadastrarSenha() 
			throws PasswordDidNotMatch  {
		
		
		if(password.length() < 8 || password.length() > 12) {
			throw new PasswordDidNotMatch(password.length(), "Op1");
		} 
		
		if(!password.matches(".*[A-Z].*")) {
		throw new PasswordDidNotMatch(password.length(), "Op2");
		}
		
		if(!password.matches(".*\\d.*")) {
			throw new PasswordDidNotMatch(password.length(), "Op3");
		}
		
		if(!password.matches(".*[!@#?].*")) {
			throw new PasswordDidNotMatch(password.length(), "Op4");
		}

		for(int i = 0; i < password.length() - 1; i++) {
			if(password.charAt(i) == password.charAt(i + 1)) {
				throw new PasswordDidNotMatch(password.length(), "Op5");
			}
		}
		
		if(password.matches(".*\\s.*")) {
			throw new PasswordDidNotMatch(password.length(), "Op6");
		}
				
		JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso!");
		JOptionPane.showMessageDialog(null, password);
	}
}