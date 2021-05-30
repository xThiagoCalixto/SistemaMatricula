package dominio;

public class Turma extends EntidadeDominio {
	private int id_turma;
	private int capacidade;
	private int ano;
	private int semestre;
	
	
	public int getId_turma() {
		return id_turma;
	}

	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	public Turma(int capacidade, int ano, int semestre) {
		super();
		this.capacidade = capacidade;
		this.ano = ano;
		this.semestre = semestre;
	}
	
	

	
}
