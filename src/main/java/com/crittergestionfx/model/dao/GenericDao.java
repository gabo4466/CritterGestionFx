package com.crittergestionfx.model.dao;

import java.util.ArrayList;

public interface GenericDao <G> {
    public G update(G obj);
    public G delete(int id);
    public G create(G obj);
    public G read(int id);
}

