package com.cybertools.collageCBDD;

//@author jpjar
import java.sql.*;

public class Test {

    public static void main(String[] args) {

        Connection conn = CBDD.getConnection();
        
        System.out.println(conn);

    }

}
