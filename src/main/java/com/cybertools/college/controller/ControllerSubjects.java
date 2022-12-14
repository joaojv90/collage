package com.cybertools.college.controller;

import com.cybertools.college.cbdd.CBDD;
import com.cybertools.college.model.ModelSubjects;

import java.sql.*;
import java.util.*;

import org.apache.log4j.Logger;
 
public class ControllerSubjects implements DAO<ModelSubjects>{
	
	private static Logger log = Logger.getLogger(ControllerSubjects.class);
	
	Statement st = null;
	PreparedStatement ps = null;
    
    static Connection conn = CBDD.getConnection();
    
    @Override
    public List<ModelSubjects> read() {
        List<ModelSubjects> listSubjects = new ArrayList<>();
        try {
            String query = "SELECT * FROM subjects";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
               ModelSubjects ms = new ModelSubjects();
               ms.setIdSubjects(rs.getInt(1));
               ms.setNameSubjects(rs.getString(2));
               listSubjects.add(ms);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return listSubjects;
    }
    
    @Override
    public boolean create(ModelSubjects t) {        
        try {
            String query = "INSERT INTO subjects (nameSubjects) VALUES (?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, t.getNameSubjects());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace();
        }   
        return false;
    }
    
    @Override
    public boolean update(ModelSubjects t) {       
        try {
            String query = "UPDATE subjects SET nameSubjects=? WHERE idSubjects=?";
            ps = conn.prepareStatement(query);
            ps.setInt(2, t.getIdSubjects());
            ps.setString(1, t.getNameSubjects());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean delete(ModelSubjects t) {    
        try {
            String query = "DELETE FROM subjects WHERE idSubjects=?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, t.getIdSubjects());
            log.info(t);
            log.info(ps.toString());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace();
        }   
        return false;
    }

}
