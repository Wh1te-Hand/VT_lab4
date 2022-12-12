package bsuir.VT.Shamko.builder;

import bsuir.VT.Shamko.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
