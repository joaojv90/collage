package com.cybertools.college.controller;

import com.cybertools.college.cbdd.CBDD;
import com.cybertools.college.model.ModelStudents;

import java.sql.*;

public class ControllerProcedures implements DAOProcedures<ModelStudents>{
	
    static Connection conn = CBDD.getConnection();
    CallableStatement cs = null;

    @Override
    public String correoEst(ModelStudents modelStudents){
        String result = null;
        try {
            cs = conn.prepareCall("{call correoEst(?)}");
            cs.setString(1,modelStudents.getNui());
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                result = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
