package dao.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import dao.IDAO;
import dominio.EntidadeDominio;
import dominio.Materia;
import dominio.enums.modulo;
import dominio.enums.semana;
import dominio.enums.turno;
import util.Conexao;

public class MateriaDAO implements IDAO {

	
	@Override
	public void salvar(EntidadeDominio entidade) {
		
		Materia materia = (Materia) entidade;
		String create = "insert into materias (nome, turno, modulo,descricao,carga_horaria,dia_semana) values (?,?,?,?,?,?)";
		Connection connection = new Conexao().conectar();
	
		try {
			
			PreparedStatement pst = connection.prepareStatement(create);
			pst.setString(1, materia.getNome());
			pst.setString(2, materia.getTurno().name());
			pst.setString(3, materia.getModulo().name());
			pst.setString(4, materia.getDescricao());
			pst.setInt(5, materia.getCargaHoraria());
			pst.setString(6, materia.getDiaSemana().name());
			pst.executeUpdate();
			System.out.println("Query Executada - Materia");
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