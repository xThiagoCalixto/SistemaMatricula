package dominio.enums;

public enum semana {
	SEGUNDA,
	TERCA,
	QUARTA,
	QUINTA,
	SEXTA,
	SABADO;
	
	private String nomeSemana;
	private int numSemana;
	
	public String getNomeSemana() {
		return (String)nomeSemana;
	}
	public void setNomeSemana(String nomeModulo) {
		this.nomeSemana = nomeModulo;
	}
	public int getNumSemana() {
		return numSemana;
	}
	public void setNumSemana(int numModulo) {
		this.numSemana = numModulo;
	}
	
	private void moduloToString(String nomeModulo, int numModulo) {
		this.nomeSemana = nomeModulo;
		this.numSemana = numModulo;
	}
	
}
