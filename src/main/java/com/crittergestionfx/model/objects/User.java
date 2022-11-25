package com.crittergestionfx.model.objects;

import com.crittergestionfx.model.daoImp.UserDaoImp;
import com.crittergestionfx.model.exceptions.UserException;

import java.sql.SQLException;
import java.util.ArrayList;

public class User {
    private int idUser;
    private boolean admin;
    private String name;
    private String email;
    private String password;
    private boolean banned;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public User() {

    }

    public User(int idUser, String email, String name, boolean banned) {
        this.idUser = idUser;
        this.email = email;
        this.name = name;
        this.banned = banned;
    }

    public User(int idUser, String email, String name, boolean banned, boolean admin) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.banned = banned;
        this.admin = admin;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User logIn() throws SQLException, ClassNotFoundException, UserException{
        return UserDaoImp.getInstance().logIn(this);
    }

    public ArrayList<User> getAll() throws SQLException, ClassNotFoundException {
        return UserDaoImp.getInstance().getAll();
    }
}
