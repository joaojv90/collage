package com.cybertools.collegeController;

//@author jpjar

import com.cybertools.collegeCBDD.CBDD;
import com.cybertools.collegeModel.ModelTeachers;
import java.sql.*;
import java.util.*;

 
public class ControllerTeachers implements DAO <ModelTeachers>{
    
    static Connection conn = CBDD.getConnection();

    @Override
    public List<ModelTeachers> read() {
        List<ModelTeachers> listTeachers = new ArrayList<>();
        try {
            String query = "SELECT * FROM teachers";
            ResultSet rs = conn.createStatement().executeQuery(query);
            while (rs.next()){
               ModelTeachers mt = new ModelTeachers();
               mt.setNui(rs.getString(1));
               mt.setFirstName(rs.getString(2));
               mt.setLastName(rs.getString(3));
               mt.setMailAddress(rs.getString(4));
               listTeachers.add(mt);
            }
        }catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return listTeachers;}

    @Override
    public boolean create(ModelTeachers t) {
        try {
            String query = "INSERT INTO teachers (nui, firstName, lastName, mailAddress) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, t.getNui());
            ps.setString(2, t.getFirstName());
            ps.setString(3, t.getLastName());
            ps.setString(4, t.getMailAddress());
            return ps.executeUpdate() != 0; //si no se ejecuta
        }catch (Exception ex) {
            ex.printStackTrace(System.out);
        }   
        return false;}

    @Override
    public boolean update(ModelTeachers t) {
        try {
            String query = "UPDATE teachers SET firstName=?, lastName=?, mailAddress=? WHERE nui=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(4, t.getNui());
            ps.setString(1, t.getFirstName());
            ps.setString(2, t.getLastName());
            ps.setString(3, t.getMailAddress());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return false;}

    @Override
    public boolean delete(ModelTeachers t) {
        try {
            String query = "DELETE FROM teachers WHERE nui=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, t.getNui());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace(System.out);
        }   
        return false;}

}
