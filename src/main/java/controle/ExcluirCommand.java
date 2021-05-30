package controle;

import dominio.EntidadeDominio;

public class ExcluirCommand extends AbstractCommand{
	
	public String execute(EntidadeDominio entidade) {
		
		return fachada.excluir(entidade);
	}

}
