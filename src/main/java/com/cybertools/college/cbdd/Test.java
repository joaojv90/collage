package com.cybertools.college.cbdd;

//@author jpjar
import java.sql.*;

import org.apache.log4j.Logger;

public class Test {
	
	private static Logger log = Logger.getLogger(Test.class);

    public static void main(String[] args) {

        Connection conn = CBDD.getConnection();
        
        log.info(conn);

    }

}
