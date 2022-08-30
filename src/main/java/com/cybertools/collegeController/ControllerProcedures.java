package com.cybertools.collegeController;

import com.cybertools.collegeCBDD.CBDD;
import com.cybertools.collegeModel.ModelStudents;
import java.sql.*;

public class ControllerProcedures implements DAOProcedures<ModelStudents>{
    static Connection conn = CBDD.getConnection();

    @Override
    public String correoEst(ModelStudents modelStudents){
        String result = null;
        try {
            CallableStatement cs = conn.prepareCall("{call correoEst(?)}");
            cs.setString(1,modelStudents.getNui());
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                result = rs.getString(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}
