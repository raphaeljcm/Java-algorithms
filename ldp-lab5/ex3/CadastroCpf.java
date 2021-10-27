package edu.newton.ldp.u5.lab.ex3;

import javax.swing.JOptionPane;

public class CadastroCpf {

	String cpf;
	
	public void cadastrarCpf() throws CpfInvalido {
		// limpando qualquer - ou . do CPF
		cpf = limparCpf(cpf);
		
		// validando se todos os números são iguais
		if(!validacaoDeNumerosIguais(cpf)) {
			throw new CpfInvalido("Error1");
		}
		
		// validando se tem letras 
		if(!validandoLetras(cpf)) {
			throw new CpfInvalido("Letters");
		}
		
		if(validacaoDigito1(cpf)) {
			if(validacaoDigito2(cpf)) {
				var printCpf = cpfFormat(cpf);
				
				JOptionPane.showMessageDialog(null, "O CPF " + printCpf + " é válido!!");
			} else {
				throw new CpfInvalido("Error4");
			}
		} else {
			throw new CpfInvalido("Error3");
		}
	}
			
	private static boolean validacaoDigito1(String cpf) throws CpfInvalido {
		int digito1 = 0, soma = 0, currentNumber = 0;
		int[] pesoCPF = {10, 9, 8, 7, 6, 5, 4, 3, 2};
				
		digito1 = Integer.parseInt(String.valueOf(cpf.charAt(9)));
		
		for(int i = 0; i < 9; i++) {
			currentNumber = Integer.parseInt(String.valueOf(cpf.charAt(i)));
			
			if(currentNumber < 0 || currentNumber > 9) {
				throw new CpfInvalido("Error2"); 
			}
			
			currentNumber = currentNumber * pesoCPF[i];
			soma += currentNumber;
			currentNumber = 0;
		}
		
		soma = (soma * 10) % 11;
		
		if(soma == 10) {
			soma = 0;
		}
		
		if(soma == digito1) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean validacaoDigito2(String cpf) throws CpfInvalido {
		int digito2 = 0, soma = 0, currentNumber = 0;
		int[] pesoCPF = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
		
		digito2 = Integer.parseInt(String.valueOf(cpf.charAt(10)));
		
		for(int i = 0; i < 10; i++) {
			currentNumber = Integer.parseInt(String.valueOf(cpf.charAt(i)));
			
			if(currentNumber < 0 || currentNumber > 9) {
				throw new CpfInvalido("Error2"); 
			}
			
			currentNumber = currentNumber * pesoCPF[i];
			soma += currentNumber;
			currentNumber = 0;
		}
		
		soma = (soma * 10) % 11;
		
		if(soma == 10) {
			soma = 0;
		}
		
		if(soma == digito2) {
			return true;
		} else {
			return false;
		}
	}

	private static String limparCpf(String cpf) {
		cpf = cpf.replace(".", " ");
		cpf = cpf.replace("-", " ");
		cpf = cpf.replaceAll(" ", "");
		return cpf;
	}
	
	private static String cpfFormat(String cpf) {
		cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
		
		return cpf;
	}
	
	private static boolean validacaoDeNumerosIguais(String cpf) {
		if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
			cpf.equals("22222222222") || cpf.equals("33333333333") ||
			cpf.equals("44444444444") || cpf.equals("55555555555") ||
			cpf.equals("66666666666") || cpf.equals("77777777777") ||
			cpf.equals("88888888888") || cpf.equals("99999999999") ||
	        cpf.length() != 11) {
			
			return false;
		} else {
			return true;
		}
	}
	
	private static boolean validandoLetras(String cpf) {
		return cpf.matches(".*[0-9].*");
	}
}