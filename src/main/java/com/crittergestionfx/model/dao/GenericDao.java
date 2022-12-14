package com.crittergestionfx.model.dao;

import com.crittergestionfx.model.exceptions.UserException;

import java.sql.SQLException;
import java.util.ArrayList;

public interface GenericDao <G> {
    public boolean update(G obj) throws Exception;
    public G delete(int id);
    public G create(G obj) throws SQLException, Exception;
    public G read(int id) throws SQLException, Exception;
}

