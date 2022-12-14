package com.cybertools.college.controller;

import com.cybertools.college.cbdd.CBDD;
import com.cybertools.college.model.ModelStudents;

import java.sql.*;
import java.util.*;

import org.apache.log4j.Logger;
 
public class ControllerStudents implements DAO <ModelStudents>{
	
	Statement st = null; 
	PreparedStatement ps = null;
	
	private static Logger log = Logger.getLogger(ControllerStudents.class);
    
    static Connection conn = CBDD.getConnection();

    @Override
    public List<ModelStudents> read() {
        List<ModelStudents> listStudents = new ArrayList<>();
        try {
            String query = "SELECT * FROM students";
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
               ModelStudents ms = new ModelStudents();
               ms.setNui(rs.getString(1));
               ms.setFirstName(rs.getString(2));
               ms.setLastName(rs.getString(3));
               ms.setAddress(rs.getString(4));
               ms.setMailAddress(rs.getString(5));
               ms.setPhone(rs.getString(6));
               listStudents.add(ms);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return listStudents;
    }

    @Override
    public boolean create(ModelStudents t) {        
        try {
            String query = "INSERT INTO students (nui, firstName, lastName, address, mailAddress, phone) VALUES (?,?,?,?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, t.getNui());
            ps.setString(2, t.getFirstName());
            ps.setString(3, t.getLastName());
            ps.setString(4, t.getAddress());
            ps.setString(5, t.getMailAddress());
            ps.setString(6, t.getPhone());
            return ps.executeUpdate() != 0; 
        }catch (Exception ex) {
            ex.printStackTrace();
        }   
        return false; 
    }

    @Override
    public boolean update(ModelStudents t) {       
        try {
            String query = "UPDATE students SET firstName=?, lastName=?, address=?, mailAddress=?, phone=? WHERE nui=?";
            ps = conn.prepareStatement(query);
            ps.setString(6, t.getNui());
            ps.setString(1, t.getFirstName());
            ps.setString(2, t.getLastName());
            ps.setString(3, t.getAddress());
            ps.setString(4, t.getMailAddress());
            ps.setString(5, t.getPhone());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(ModelStudents t) {    
        try {
            String query = "DELETE FROM students WHERE nui=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, t.getNui());
            log.info(t);
            log.info(ps.toString());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace();
        }   
        return false;
    }

}
