package controle;

import java.util.List;

import dominio.EntidadeDominio;



public class ConsultarCommand extends AbstractCommand{
	
	public List<EntidadeDominio> execute(EntidadeDominio entidade) {
		
		return fachada.consultar(entidade);
	}

}
