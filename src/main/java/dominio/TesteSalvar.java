package dominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import controle.Fachada;

public class TesteSalvar {

	public static void main(String[] args) throws ParseException {
		
		String dataBr = "10/08/1992";
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataFormatada = formato.parse(dataBr);
		
		Aluno aluno = new Aluno("Thiago Calixto", "38823991803", dataFormatada, "calixo_lima@yahoo.com.br");
		Fachada facade = new Fachada();
		facade.cadastrar(aluno);
		System.out.println("executado");

	}
}
