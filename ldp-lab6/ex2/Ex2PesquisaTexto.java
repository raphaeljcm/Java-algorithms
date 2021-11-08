package edu.newton.ldp.u6.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex2PesquisaTexto {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o nome do arquivo: ");
		var arq = read.nextLine();
		
		System.out.println("Digite a palavra: ");
		var palavra = read.nextLine();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(arq));
			
			String linha = null;
			
			while((linha = br.readLine()) != null)  {
				var countTimes = 0;
				
				if(linha.contains(palavra)) {
					countTimes++;
					System.out.println("INFO: palavra encontrada no arquivo " + countTimes);
				}
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(br != null) {
				br.close();
			}
		}
		read.close();
	}
}