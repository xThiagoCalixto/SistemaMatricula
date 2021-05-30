package controle;

import dominio.EntidadeDominio;

public class AlterarCommand extends AbstractCommand{
	public String execute(EntidadeDominio entidade) {		
		return fachada.alterar(entidade);
	}

}
