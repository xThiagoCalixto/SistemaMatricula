package controle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.IDAO;
import dao.implementacao.AlunoDAO;
import dao.implementacao.CursoDAO;
import dao.implementacao.MateriaDAO;
import dao.implementacao.TurmaDAO;
import dominio.Aluno;
import dominio.Curso;
import dominio.EntidadeDominio;
import dominio.Materia;
import dominio.Turma;



public class Fachada implements IFachada {
	private Map<String, IDAO> daos;
	//private Map<String, List<IStrategy>> rns;

	public Fachada() {
		definirDAOS();
		//definirRNS();
	}
/*
	private void definirRNS() {
		rns = new HashMap<String, List<IStrategy>>();

		ValidadorDadosObrigatoriosCliente vCiente = new ValidadorDadosObrigatoriosCliente();
		ValidadorCpf vCpf = new ValidadorCpf();
		ComplementarDtCadastro cDtCadastro = new ComplementarDtCadastro();
		ValidadorCredito vCredito = new ValidadorCredito();
		ValidadorDependentes vDependnetes = new ValidadorDependentes();
		ValidadorExistencia vExistencia = new ValidadorExistencia();

		List<IStrategy> rnsCliente = new ArrayList<IStrategy>();
		rnsCliente.add(vCiente);
		rnsCliente.add(vCpf);		
		rnsCliente.add(vCredito);
		rnsCliente.add(vDependnetes);
		rnsCliente.add(vExistencia);
		rnsCliente.add(cDtCadastro);
		rns.put(Cliente.class.getName(), rnsCliente);
		
		List<IStrategy> rnsFornecedor = new ArrayList<IStrategy>();
		rnsFornecedor.add(vCpf);
		rnsFornecedor.add(cDtCadastro);
		rns.put(Fornecedor.class.getName(), rnsFornecedor);
	}
*/
	
	private void definirDAOS() {
		daos = new HashMap<String, IDAO>();
		daos.put(Aluno.class.getName(), new AlunoDAO());
		daos.put(Curso.class.getName(), new CursoDAO());
		daos.put(Materia.class.getName(), new MateriaDAO());
		daos.put(Turma.class.getName(), new TurmaDAO());
		
		//daos.put(Produto.class.getName(), new ProdutoDAO());
		//daos.put(Fornecedor.class.getName(), new FornecedorDAO());
	}

	@Override
	public String cadastrar(EntidadeDominio entidade) {
		//String msg = executarRegras(entidade); Apagar linha abaixo
		String msg = null;
		String nmClasse = entidade.getClass().getName();
		if (msg == null) {
			IDAO dao = daos.get(nmClasse);
			dao.salvar(entidade);
		} else {
			return msg;
		}
		return null;
	}
/*
	private String executarRegras(EntidadeDominio entidade) {
		String nmClasse = entidade.getClass().getName();
		StringBuilder msg = new StringBuilder();

		List<IStrategy> regras = rns.get(nmClasse);

		if (regras != null) {
			for (IStrategy s : regras) {
				String m = s.processar(entidade);

				if (m != null) {
					msg.append(m);
					msg.append("\n");
				}
			}
		}

		if (msg.length() > 0)
			return msg.toString();
		else
			return null;
	}
*/
	@Override
	public String excluir(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

}
