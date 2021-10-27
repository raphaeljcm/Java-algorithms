package edu.newton.ldp.u5.lab.ex3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		var cpf1 = new CadastroCpf();
		boolean success = false;
		
		while(!success) {
			try {
				cpf1.cpf = JOptionPane.showInputDialog("Por favor digite o CPF desejado:");
				cpf1.cadastrarCpf();
				success = true;
			} catch(CpfInvalido ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("Terminou!");
	}
}