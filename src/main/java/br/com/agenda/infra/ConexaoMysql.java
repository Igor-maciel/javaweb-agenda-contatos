package br.com.agenda.infra;

import java.sql.DriverManager;

import com.sun.jdi.connect.spi.Connection;

public class ConexaoMysql {
	 private String driver = "com.mysql.cj.jdbc.Driver";
	    // caminho onde o banco esta fisicamente
	    private static final String DATABASE_URL =
	            "jdbc:mysql://127.0.0.1:3306/agenda?useTimezone=true&serverTimezone=UTC";

	    // usuario do banco
	    private static final String USERNAME = "root";
	    // senha do banco
	    private static final String PASSWORD ="";

	    private Connection conectar() {
	        Connection connection = null;
	        try {
	            Class.forName(driver);
	            connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	            return connection;
	        } catch (Exception e) {
	            System.out.println(e);
	            return null;
	        }
	    }

	    public void testaConexao() {
	        try {
	            Connection connection = conectar();
	            System.out.println("Conectado com sucesso ->" + connection);
	            connection.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

}
