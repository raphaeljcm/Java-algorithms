package edu.newton.ldp.u6.lab6.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Raphael Cardoso
 * Escreva um programa que lê do usuário o nome de um arquivo existente (A)
 * e um diretório de destino (D2) e realiza o movimento do arquivo de D1 para D2.
 * 
 * OBS: Waldir, no meu código eu estou fazendo o recortar da pasta atual, ou seja
 * se for testar, colocar o arquivo a ser recortado no ./ do eclipse ou outra IDE aí, valeu!
 * 
 * 
 * Plus: muito massa essas atividades, saber como funciona debaixo dos panos é legal demais!!!
 */

public class Ex1 {
	
	public static boolean fileAlreadyExists(File dir, String fileName) {
		var files = dir.list();
		boolean found = false;
		
		for(var item: files) {
			if(item.equals(fileName)) {
				found = true;
			}
		}
		
		return found;
	}
	
	public static boolean moveFile(File src, String dtn) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dtn);
			
			int counter;
			
			while((counter = fis.read()) != -1) {
				fos.write(counter);
			}
			
			fos.flush();
			return true;
		} catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			return false;
		} finally {
			if (fis != null) {
				// Encerrar o fluxo
				fis.close();
			}
			// Encerrar o fluxo de escrita no arquivo
			if (fos != null) {
				fos.close();
			}
		}
	}
	
	public static void main(String[] args) throws ErrorsEx1Exception, IOException {
		
		Scanner read = new Scanner(System.in);
		
		// Solicitar o usuário o nome de um arq existente
		System.out.println("Please, type the name of the file you want to move:");
		var fileName = read.nextLine();
			
		// Arquivo com caminho
		var actualFile = new File("./" + fileName);
			
		if(!actualFile.exists()) {
			read.close();
			throw new ErrorsEx1Exception("Erro1");
		}
		
		System.out.println("Now, type the directory you want to move your file");
		var pathName = read.nextLine();
		
		var destinyDirectory = new File(pathName);
		
		// Se o diretório não existir, crie um
		if(!destinyDirectory.exists()) {
			System.out.println("This directory doesn't exist. Do you want to create one?");
			var answer = read.nextLine();
			
			if(answer.toLowerCase().equals("yes") || answer.toLowerCase().equals("sim")) {
				//Criando diretório
				destinyDirectory.mkdirs();
			} else {
				System.out.println("Bye dude!");
				read.close();
			}
		} 
		
		// Movendo arquivo
		var newFile = destinyDirectory + "\\" + fileName;
		
		var exists = fileAlreadyExists(destinyDirectory, fileName);
		
		// Se o arquivo já existir
		if(exists) {
			System.out.println("File already exists, try again!");
			return;
		}
		
		var result = moveFile(actualFile, newFile);
		
		// Deletando arquivo origem
		if(result) {
			if(actualFile.delete()) {
				System.out.println("Operation Complete, thank you Sir, have a good one!");
			}
		}
		
		read.close();
	}
}