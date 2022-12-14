package com.cybertools.college.controller;

import com.cybertools.college.cbdd.CBDD;
import com.cybertools.college.model.ModelUsers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerLogin implements DAOLogin<ModelUsers> {
	
	PreparedStatement ps = null;

    static Connection conn = CBDD.getConnection();

    @Override
    public boolean login(ModelUsers modelUsers) {
        boolean result = false;
        try {
            String query = "SELECT * FROM usersLogin WHERE mail=? AND pass=md5(?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, modelUsers.getMail());
            ps.setString(2, modelUsers.getPass());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = true;                
            }
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean register(ModelUsers modelUsers) {
        try {
            String query = "INSERT INTO usersLogin (mail,pass) VALUES (?,md5(?))";
            ps = conn.prepareStatement(query);
            ps.setString(1, modelUsers.getMail());
            ps.setString(2, modelUsers.getPass());
            return ps.executeUpdate() != 0;
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        return false;
    }
}
