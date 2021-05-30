package dao.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import dao.IDAO;
import dominio.Aluno;
import dominio.EntidadeDominio;
import util.Conexao;

public class AlunoDAO implements IDAO {

	@Override
	public void salvar(EntidadeDominio entidade) {

		Aluno aluno = (Aluno) entidade;
		String create = "insert into alunos (nome, cpf, dt_nascimento,email) values (?,?,?,?)";
		Connection connection = new Conexao().conectar();
	
		try {
			
			java.sql.Date startDate = new java.sql.Date(aluno.getDt_nascimento().getDate());
			
			PreparedStatement pst = connection.prepareStatement(create);
			pst.setString(1, aluno.getNome());
			pst.setString(2, aluno.getCPF());
			pst.setDate(3, startDate);
			pst.setString(4, aluno.getEmail());
			pst.executeUpdate();
			System.out.println("Query Executada - Alunos");
			connection.close();

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
