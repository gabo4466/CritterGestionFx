package com.crittergestionfx.model.dao;

import java.util.ArrayList;

public interface GenericDao <G> {
    public boolean update(G obj);
    public boolean delete(G obj);
    public G add(G obj);
    public ArrayList<G> getAll();
    public ArrayList<G> search(int idx, int pag, String term);
    public G get(int id);
    public int count(String term);
}

