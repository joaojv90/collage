package com.cybertools.college.controller;

import com.cybertools.college.cbdd.CBDD;
import com.cybertools.college.model.ModelCareers;

import java.sql.*;
import java.util.*;
 
public class ControllerCareers implements DAO<ModelCareers>{
	
	Statement st = null; 
	PreparedStatement ps = null;
    
    static Connection conn = CBDD.getConnection();
    
    @Override
    public List<ModelCareers> read() {
        List<ModelCareers> listSubjects = new ArrayList<>();
        try {
            String query = "SELECT * FROM careers";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ModelCareers ms = new ModelCareers();
                ms.setIdCareers(rs.getInt(1));
                ms.setNameCareer(rs.getString(2));
                listSubjects.add(ms);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listSubjects;
    }

    @Override
    public boolean create(ModelCareers t) {
        try {
            String query = "INSERT INTO careers (nameCareer) VALUES (?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, t.getNameCareer());
            return ps.executeUpdate() != 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(ModelCareers t) {
        try {
            String query = "UPDATE careers SET nameCareer=? WHERE idCareers=?";
            ps = conn.prepareStatement(query);
            ps.setInt(2, t.getIdCareers());
            ps.setString(1, t.getNameCareer());
            return ps.executeUpdate() != 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean delete(ModelCareers t) {
        try {
            String query = "DELETE FROM careers WHERE idCareers=?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, t.getIdCareers());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace();
        }   
        return false;
    }

}
