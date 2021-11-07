package edu.newton.ldp.u6.lab6.ex1;

public class ErrorsEx1Exception extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErrorsEx1Exception(String typeError) {
		super("Erro");
		
		if(typeError == "Erro1") {
			System.out.println("File does not exist!");
		}
	}
}