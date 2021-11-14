package edu.newton.ldp.u7.lab7.ex1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEx1 {

	// Ex1:
	// Entrada: um caminho de diretório informado pelo usuário
	// Saída: exibir todos os arquivos do diretório e sub-diretoŕios (usando recursão)
	
	private static List<File> listTree(File path) {
		List<File> files = new ArrayList<File>();
		
		File[] listas = path.listFiles();
		
		for(File lista : listas) {
			if(lista.isDirectory()) {
				// adiciona diretórios
				files.add(lista);
				// adiciona todos os sub-diretórios
				files.addAll(listTree(lista));
			} else {
				// adiciona os arquivos
				files.add(lista);
			}
		}
		return files;
	}
	
	public static void main(String[] args) {	
		Scanner read = new Scanner(System.in);
		List<File> allDirectories = null;
		
		System.out.println("Hi dude, please type here the directory:");
		var path = read.nextLine();
		
		File file = new File(path);
		
		if(file.isDirectory()) {			
			allDirectories = listTree(file);
		} else {
			System.out.println("Try again");
		}
		
		read.close();
		
		for(var eachDirectory : allDirectories) {
			System.out.println("--> " + eachDirectory);
		}
	}
}