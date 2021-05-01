package br.com.agenda.model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.agenda.infra.ConexaoJdbc;
import br.com.agenda.infra.ConexaoMysql;
import br.com.agenda.model.entity.Contato;

public class ContatoDao implements BaseDao<Contato,Long>{
	 private final ConexaoJdbc conexao;
	    private String statement;

	    public ContatoDao() throws SQLException, ClassNotFoundException {
	        this.conexao = new ConexaoMysql();
    }
	@Override
	public void create(Contato contato) throws SQLException {
		statement = "INSERT INTO contato(nome, fone, email, observacao) values(?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = this.conexao.getConnection().prepareStatement(statement)) {
            preparedStatement.setString(1, contato.getNome());
            preparedStatement.setString(2, contato.getFone());
            preparedStatement.setString(3, contato.getEmail());
            preparedStatement.setString(4, contato.getObservacao());

            preparedStatement.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
	}

	@Override
	public List<Contato> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contato findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Contato entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}