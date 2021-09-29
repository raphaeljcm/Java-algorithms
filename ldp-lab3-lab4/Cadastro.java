package edu.newton.ldp.u3.lab3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cadastro {
	
	public static void main(String[] args) {
		ArrayList<PessoaFisica> registros = new ArrayList<>();
		
        JFrame frame = new JFrame("Cadastro: ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
		
        var painel = frame.getContentPane();
        
		// TOPO
        var painelNorte = new JPanel(new FlowLayout());
        var label = new JLabel("Cadastro e listagem: ");
        var contagem = new JLabel("(" + registros.size() + ")");
        painelNorte.add(label);
        painelNorte.add(contagem);

        painel.add(painelNorte, BorderLayout.NORTH);
        
        // MEIO
        var painelMeio = new JPanel();
        painelMeio.setLayout(new GridBagLayout());
        var constraints = new GridBagConstraints();
            
        var numeroLabel = new JLabel(" Número registro: ");
        var numeroRegistro = new JLabel("0");
        var nomeLabel = new JLabel(" Nome completo: ");
        var textNome = new TextField(20);
        
        var cpfLabel = new JLabel(" CPF: ");
        var textCpf = new TextField(20);
        var emailLabel = new JLabel(" Email: ");
        var textEmail = new TextField(20);
        var telefoneLabel = new JLabel(" Telefone: ");
        var textTelefone = new TextField(20);
        var nascimentoLabel = new JLabel(" Data de nascimento: ");
        var textNascimento = new TextField(20);
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        painelMeio.add(numeroLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        painelMeio.add(numeroRegistro, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        painelMeio.add(nomeLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        painelMeio.add(textNome, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        painelMeio.add(cpfLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        painelMeio.add(textCpf, constraints);
        constraints.gridx = 0;
        constraints.gridy = 3;
        painelMeio.add(emailLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 3;
        painelMeio.add(textEmail, constraints);
        constraints.gridx = 0;
        constraints.gridy = 4;
        painelMeio.add(telefoneLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 4;
        painelMeio.add(textTelefone, constraints);
        constraints.gridx = 0;
        constraints.gridy = 5;
        painelMeio.add(nascimentoLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 5;
        painelMeio.add(textNascimento, constraints);
        
        painel.add(painelMeio);
        
        // BUTTONS
        var painelSul = new JPanel(new FlowLayout());
        
        var buttonVoltar = new JButton("Voltar");
        var buttonAvancar = new JButton("Avançar");
        var buttonSalvar = new JButton("Salvar");
        var buttonExcluir = new JButton("Excluir");
        
        painelSul.add(buttonVoltar);
        painelSul.add(buttonAvancar);
        painelSul.add(buttonSalvar);
        painelSul.add(buttonExcluir);
        
        painel.add(painelSul, BorderLayout.SOUTH);
        
        frame.setVisible(true);
     
        // EVENTS
        
        buttonSalvar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		var currentRegistro = Integer.parseInt(numeroRegistro.getText());
        		
        		if(currentRegistro == registros.size()) {
        			frame.setTitle("Cadastro: ");
        		} else {
        			frame.setTitle("Registros");
        		}
        		
        		try {	
	        		if(currentRegistro >= registros.size()) {
	        			var registro = currentRegistro;
	        			var nome = textNome.getText();
	            		var cpf = Integer.parseInt(textCpf.getText());
	            		var email = textEmail.getText();
	            		var telefone = Integer.parseInt(textTelefone.getText());
	            		var nascimento = textNascimento.getText();
	            		
	            		var pessoa = new PessoaFisica(registro, nome, cpf, email, telefone, nascimento);
	            		
	            		registros.add(pessoa);
	            		
	            		System.out.println(registros.toString());
	            		
	            		// limpando
	            		textNome.setText("");
	            		textCpf.setText("");
	            		textEmail.setText("");
	            		textTelefone.setText("");
	            		textNascimento.setText("");
	            		
	            		var cont = Integer.parseInt(numeroRegistro.getText());
	            		numeroRegistro.setText(Integer.toString(cont + 1));
	            		
	            		contagem.setText("(" + registros.size() + ")");
	        		} else {
	        			System.out.println("Por favor, vá para a tela de cadastro");
	        			contagem.setText("(" + registros.size() + ")");
	        		}
        		} catch(NumberFormatException error) {
        			System.out.println("Campos vazios ou do formato incorreto.");
        		}
        		
        		
        		currentRegistro = Integer.parseInt(numeroRegistro.getText());
        		
        		if(currentRegistro == registros.size()) {
        			frame.setTitle("Cadastro: ");
        		} else {
        			frame.setTitle("Registros");
        		}
        	}
        });
        
        buttonVoltar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {	
        		var cont = Integer.parseInt(numeroRegistro.getText());
        		
        		if(cont == registros.size()) {
        			frame.setTitle("Cadastro: ");
        		} else {
        			frame.setTitle("Registros");
        		}
        		
        		try {
	                textNome.setText(" " + registros.get(cont - 1).nomeCompleto);
	                textCpf.setText(" " + registros.get(cont - 1).cpf);
	                textEmail.setText(" " + registros.get(cont - 1).email);
	                textTelefone.setText(" " + registros.get(cont - 1).telefone);
	                textNascimento.setText(" " + registros.get(cont - 1).dataNascimento);
	                
	                numeroRegistro.setText(Integer.toString(cont - 1));
	                contagem.setText("(" + registros.size() + ")");
        		} catch(IndexOutOfBoundsException error) {
        			if(registros.isEmpty()) {
        				System.out.println("Total de 0 registros, por favor, cadastre primeiro!");
        				contagem.setText("(" + registros.size() + ")");
        			} else {
        				textNome.setText(" " + registros.get(cont).nomeCompleto);
    	                textCpf.setText(" " + registros.get(cont).cpf);
    	                textEmail.setText(" " + registros.get(cont).email);
    	                textTelefone.setText(" " + registros.get(cont).telefone);
    	                textNascimento.setText(" " + registros.get(cont).dataNascimento);
    	                contagem.setText("(" + registros.size() + ")");
        			}
        		}
        		
        		cont = Integer.parseInt(numeroRegistro.getText());
        		
        		if(cont == registros.size()) {
        			frame.setTitle("Cadastro: ");
        		} else {
        			frame.setTitle("Registros");
        		}
        	}
        });
        
        buttonAvancar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		var cont = Integer.parseInt(numeroRegistro.getText());

        		if(cont == registros.size()) {
        			frame.setTitle("Cadastro: ");
        		} else {
        			frame.setTitle("Registros");
        		}
        		
        		try {
	                textNome.setText(" " + registros.get(cont + 1).nomeCompleto);
	                textCpf.setText(" " + registros.get(cont + 1).cpf);
	                textEmail.setText(" " + registros.get(cont + 1).email);
	                textTelefone.setText(" " + registros.get(cont + 1).telefone);
	                textNascimento.setText(" " + registros.get(cont + 1).dataNascimento);
	                
	                numeroRegistro.setText(Integer.toString(cont + 1));
	                contagem.setText("(" + registros.size() + ")");
        		} catch(IndexOutOfBoundsException error) {
        			if(registros.isEmpty()) {
        				System.out.println("Total de 0 registros, por favor, cadastre primeiro!");
        				contagem.setText("(" + registros.size() + ")");
        			} else if(Integer.parseInt(numeroRegistro.getText()) == registros.size()) {
        				System.out.println("Você está na tela de cadastros");
        				contagem.setText("(" + registros.size() + ")");
        			} else {
        				textNome.setText("");
                		textCpf.setText("");
                		textEmail.setText("");
                		textTelefone.setText("");
                		textNascimento.setText("");
                		numeroRegistro.setText(Integer.toString(cont + 1));
                		contagem.setText("(" + registros.size() + ")");
        			}
        		}
        		
        		cont = Integer.parseInt(numeroRegistro.getText());
        		
        		if(cont == registros.size()) {
        			frame.setTitle("Cadastro: ");
        		} else {
        			frame.setTitle("Registros");
        		}
        	}
        });
        
        buttonExcluir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		var cont = Integer.parseInt(numeroRegistro.getText());

        		if(cont == registros.size()) {
        			frame.setTitle("Cadastro: ");
        		} else {
        			frame.setTitle("Registros");
        		}
        		
        		try {
        			registros.remove(cont);
            		System.out.println("Removido!");
            		
            		textNome.setText(" " + registros.get(cont - 1).nomeCompleto);
                    textCpf.setText(" " + registros.get(cont - 1).cpf);
                    textEmail.setText(" " + registros.get(cont - 1).email);
                    textTelefone.setText(" " + registros.get(cont - 1).telefone);
                    textNascimento.setText(" " + registros.get(cont - 1).dataNascimento);
                    
                    numeroRegistro.setText(Integer.toString(cont - 1));
                    contagem.setText("(" + registros.size() + ")");
        		}catch(IndexOutOfBoundsException error) {
        			if(registros.isEmpty()) {
        				System.out.println("Total de 0 registros, por favor, cadastre primeiro!");
        				textNome.setText("");
                		textCpf.setText("");
                		textEmail.setText("");
                		textTelefone.setText("");
                		textNascimento.setText("");
        				contagem.setText("(" + registros.size() + ")");
        			} 
        		}
        		
        		cont = Integer.parseInt(numeroRegistro.getText());
        		
        		if(cont == registros.size()) {
        			frame.setTitle("Cadastro: ");
        		} else {
        			frame.setTitle("Registros");
        		}
        	}
        });
	}
}