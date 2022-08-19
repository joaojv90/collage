package com.cybertools.collegeController;

//@author jpjar

import com.cybertools.collegeCBDD.CBDD;
import com.cybertools.collegeModel.ModelStudents;
import java.sql.*;
import java.util.*;
 
public class ControllerStudents implements DAO <ModelStudents>{
    
    static Connection conn = CBDD.getConnection();

    @Override
    public List<ModelStudents> read() {
        List<ModelStudents> listStudents = new ArrayList<>();
        try {
            String query = "SELECT * FROM students";
            ResultSet rs = conn.createStatement().executeQuery(query);
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
            ex.printStackTrace(System.out);
        }
        return listStudents;
    }

    @Override
    public boolean create(ModelStudents t) {        
        try {
            String query = "INSERT INTO students (nui, firstName, lastName, address, mailAddress, phone) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, t.getNui());
            ps.setString(2, t.getFirstName());
            ps.setString(3, t.getLastName());
            ps.setString(4, t.getAddress());
            ps.setString(5, t.getMailAddress());
            ps.setString(6, t.getPhone());
            return ps.executeUpdate() != 0; //si no se ejecuta
        }catch (Exception ex) {
            ex.printStackTrace(System.out);
        }   
        return false; //retorna el falso
    }

    @Override
    public boolean update(ModelStudents t) {       
        try {
            String query = "UPDATE students SET firstName=?, lastName=?, address=?, mailAddress=?, phone=? WHERE nui=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(6, t.getNui());
            ps.setString(1, t.getFirstName());
            ps.setString(2, t.getLastName());
            ps.setString(3, t.getAddress());
            ps.setString(4, t.getMailAddress());
            ps.setString(5, t.getPhone());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return false;
    }

    @Override
    public boolean delete(ModelStudents t) {    
        try {
            String query = "DELETE FROM students WHERE nui=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, t.getNui());
            System.out.println(t);
            System.out.println(ps.toString());
            return ps.executeUpdate() != 0;
        }catch (Exception ex) {
            ex.printStackTrace(System.out);
        }   
        return false;
    }

}
