package com.crittergestionfx.model.daoImp;

import com.crittergestionfx.model.dao.GenericDao;
import com.crittergestionfx.model.exceptions.UserException;
import com.crittergestionfx.model.objects.User;
import com.crittergestionfx.model.services.DBConnection;
import com.crittergestionfx.model.services.PropertiesService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

public class UserDaoImp implements GenericDao<User> {

    private Connection connection;
    public static UserDaoImp instance = null;
    public static Properties prop;

    private UserDaoImp() throws SQLException, ClassNotFoundException {
        this.connection = DBConnection.getConnection();
        prop = PropertiesService.getProperties("i18_en");
    }

    public static UserDaoImp getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null){
            instance = new UserDaoImp();
        }
        return instance;
    }

    @Override
    public User update(User obj) {
        return null;
    }

    @Override
    public User delete(int id) {
        return null;
    }

    @Override
    public User create(User obj) {
        return null;
    }

    @Override
    public User read(int id) {
        return null;
    }

    public ArrayList<User> getAll() throws SQLException {
        ArrayList<User> result = new ArrayList<User>();
        String query = "select id_user, email, admin, name, banned from critter.users where admin=0;";
        PreparedStatement stmt = this.connection.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            result.add(new User(rs.getInt("id_user"), rs.getString("email"),
                    rs.getString("name"), rs.getBoolean("banned")));
        }
        return result;
    }

    public User logIn (User userNotLogged) throws SQLException, UserException, ClassNotFoundException {
        User result;
        String query = "select id_user, email, banned, name, admin from critter.users where email=? and password=?";
        PreparedStatement stmt = this.connection.prepareStatement(query);
        stmt.setString(1, userNotLogged.getEmail());
        stmt.setString(2, userNotLogged.getPassword());
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            User userExists = new User(rs.getInt("id_user"), rs.getString("email"), rs.getString("name"), rs.getBoolean("banned"), rs.getBoolean("admin"));

            if (userExists.isBanned() || !userExists.isAdmin()){
                result = null;
                throw new UserException(prop.getProperty("error.accessDenied"));
            }else{
                result = userExists;
            }
        }else{
            result = null;
            throw new UserException(prop.getProperty("error.wrongCredentials"));
        }
        return result;
    }


}
