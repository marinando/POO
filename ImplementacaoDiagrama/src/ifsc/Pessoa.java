package ifsc;

import java.time.LocalDate;

public abstract class Pessoa {
	
	private String nome;
	private LocalDate dataNasc;
	private String email;
	
	public String getNome() {
		return nome;
	}
	
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
