package dominio;

public class Curso extends EntidadeDominio {
	
	private int id_curso;
	private String nome;
	private String descricao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getId_curso() {
		return id_curso;
	}

	
	public Curso(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	
	
}
