package edu.newton.ldp.u3.lab3;

public class PessoaFisica {
	int numeroRegistro;
	String nomeCompleto;
	int cpf;
	String email;
	int telefone;
	String dataNascimento;
	
	@Override
	public String toString() {
		return "PessoaFisica [numeroRegistro=" + numeroRegistro + ", nomeCompleto=" + nomeCompleto + ", cpf=" + cpf
				+ ", email=" + email + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + "]";
	}

	public PessoaFisica(int numeroRegistro, String nomeCompleto, int cpf, String email, int telefone, String dataNascimento) {
		
		this.numeroRegistro = numeroRegistro;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNomeCompleto(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}