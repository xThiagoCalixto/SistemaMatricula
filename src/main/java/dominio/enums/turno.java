package dominio.enums;

public enum turno {
	MANHA,
	TARDE,
	NOITE;
	
	private String nomeTurno;
	private int numTurno;
	
	public String getNomeTurno() {
		return (String)nomeTurno;
	}
	public void setNomeTurno(String nomeModulo) {
		this.nomeTurno = nomeModulo;
	}
	public int getNumTurno() {
		return numTurno;
	}
	public void setNumTurno(int numModulo) {
		this.numTurno = numModulo;
	}
	
	private void moduloToString(String nomeModulo, int numModulo) {
		this.nomeTurno = nomeModulo;
		this.numTurno = numModulo;
	}
	
}
