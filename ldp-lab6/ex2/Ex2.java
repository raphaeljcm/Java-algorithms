package edu.newton.ldp.u6.lab6.ex2;

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
		
		try {
			// Solicitar o usuário o nome de um arq existente
			System.out.println("Please, type the name of the first file");
			var fileName = read.nextLine();
			
			System.out.println("Now, type the name of the second file:");
			var fileName2 = read.nextLine();
			
			read.close();
			
			fis1 = new FileInputStream("./" + fileName);
			fis2 = new FileInputStream("./" + fileName2);
			
			int counter;
			int file1 = 0, file2 = 0;
			
			// Lendo e salvando file 1
			while((counter = fis1.read()) != -1) {
				file1 += counter;
			}
			
			// Lendo e salvando foto 2
			while((counter = fis2.read()) != -1) {
				file2 += counter;
			}
			
			if(file1 == file2) {
				System.out.println("Os arquivos são idênticos!");
			} else {
				System.out.println("Os arquivos são diferentes");
			}
			
			System.out.println(file1 + " - " + file2);
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