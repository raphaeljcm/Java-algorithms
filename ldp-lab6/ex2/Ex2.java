package edu.newton.ldp.u6.lab6.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Raphael Cardoso
 *	Entrada: dois nomes de arquivos existentes (A1 e A2)
	Saída: informar se os arquivos são idênticos (i.e. o conteúdo dos dois arquivos é o mesmo).
	
	OBS: não especifiquei o caminho, colocar os arquivos a serem testados na pasta ./ da IDE
 *	
 */

public class Ex2 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		boolean provaReal = true;
		
		try {
			// Solicitar o usuário o nome de um arq existente
			System.out.println("Por favor, digite o nome do primeiro arquivo:");
			var fileName = read.nextLine();
			var file1 = new File("./" + fileName);
			
			System.out.println("Agora digite o nome do segundo arquivo:");
			var fileName2 = read.nextLine();
			var file2 = new File("./" + fileName2);
			
			read.close();
			
			// Testando se o tamanho dos arquivos são iguais
			if(file1.length() != file2.length()) {
				provaReal = false;
			}
			
			// Fluxo de leitura
			fis1 = new FileInputStream("./" + fileName);
			fis2 = new FileInputStream("./" + fileName2);
			
			int counter, counter1 = 0;
			
			// Lendo e comparando bytes
			while((counter = fis1.read()) != -1 && (counter1 = fis2.read()) != -1) {
				if(counter != counter1) {
					provaReal = false;
				}
			}
			
			if(provaReal) {
				System.out.println("Os arquivos são idênticos.");
			} else {
				System.out.println("Tente novamente, os arquivos são diferentes.");
			}
			
		} catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if(fis1 != null && fis2 != null) {
				fis1.close();
				fis2.close();
			} 
		}
	}
}