package dao.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import dao.IDAO;
import dominio.Curso;
import dominio.EntidadeDominio;
import dominio.Materia;
import util.Conexao;

public class CursoDAO implements IDAO {

	@Override
	public void salvar(EntidadeDominio entidade) {

		Curso curso = (Curso) entidade;
		String create = "insert into cursos (nome,descricao) values (?,?)";
		Connection connection = new Conexao().conectar();

		try {

			PreparedStatement pst = connection.prepareStatement(create);
			pst.setString(1, curso.getNome());
			pst.setString(2, curso.getDescricao());
			pst.executeUpdate();
			connection.close();
			System.out.println("Query Executada - Curso");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir(EntidadeDominio entidade) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EntidadeDominio> consultar(EntidadeDominio entidade) {
		// TODO Auto-generated method stub
		return null;
	}

}
