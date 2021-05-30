package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static void main(String args[]) {

	

		/*
		 * try { if (getConnectionPostgres() != null)
		 * System.out.println("CONECTADO!!!!"); else
		 * System.out.println("N�O CONECTADO!!!!"); } catch (ClassNotFoundException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); } catch (Exception e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

	/** M�dulo de Conex�o **/
	// Par�metros de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/sistema_matricula?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "1234567";

	// M�todo de conex�o com o bando de dados

	public Connection conectar() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;

		}
	}

	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
