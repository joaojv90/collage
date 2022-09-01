package com.cybertools.collegeController;

import com.cybertools.collegeModel.ModelUsers;
import com.cybertools.collegeCBDD.CBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerLogin implements DAOLogin<ModelUsers> {

    static Connection conn = CBDD.getConnection();

    @Override
    public boolean login(ModelUsers modelUsers) {
        boolean result = false;
        try {
            String query = "SELECT * FROM usersLogin WHERE mail=? AND pass=md5(?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, modelUsers.getMail());
            ps.setString(2, modelUsers.getPass());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public boolean register(ModelUsers modelUsers) {
        try {
            String query = "INSERT INTO usersLogin (mail,pass) VALUES (?,md5(?))";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, modelUsers.getMail());
            ps.setString(2, modelUsers.getPass());
            return ps.executeUpdate() != 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
