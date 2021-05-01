package br.com.agenda.model.dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Definir as assinaturas dos metodos de CRUD
 */
public interface BaseDao<T, ID> {


void create(T entity) throws SQLException;

    List<T> findAll() throws SQLException;

    T findById(ID id) throws SQLException;

    void update(T entity);

    void delete(ID id)throws SQLException;
}
