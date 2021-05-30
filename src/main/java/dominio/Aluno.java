package dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends EntidadeDominio {
	private int id_aluno;
	private String nome;
	private String CPF;
	private Date dt_nascimento;
	private String email;
	

	
	public Aluno(String nome, String CPF, Date dt_nascimento, String email) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.dt_nascimento = dt_nascimento;
		this.email = email;
	}
	
	public int getId_aluno() {
		return id_aluno;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
