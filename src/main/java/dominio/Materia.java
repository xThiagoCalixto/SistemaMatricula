package dominio;

import dominio.enums.modulo;
import dominio.enums.semana;
import dominio.enums.turno;

public class Materia extends EntidadeDominio {
	
	private int id_materia;
	private String nome;
	private turno turno;
	private semana diaSemana;
	private int cargaHoraria;
	private modulo modulo;
	private String descricao;
	
	
	
	public Materia(int id_materia, String nome, turno turno, semana diaSemana, int cargaHoraria,
			dominio.enums.modulo modulo, String descricao) {
		super();
		this.id_materia = id_materia;
		this.nome = nome;
		this.turno = turno;
		this.diaSemana = diaSemana;
		this.cargaHoraria = cargaHoraria;
		this.modulo = modulo;
		this.descricao = descricao;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public turno getTurno() {
		return turno;
	}
	public void setTurno(turno horario) {
		this.turno = horario;
	}
	public semana getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(semana diaSemana) {
		this.diaSemana = diaSemana;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public modulo getModulo() {
		return modulo;
	}
	public void setModulo(modulo modulo) {
		this.modulo = modulo;
	}
	public int getId_materia() {
		return id_materia;
	}
	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}
	
	
}
