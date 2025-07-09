package com.bookshop.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/bookshop", 
                "postgres", 
                "pass@123" 
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
package com.bookshop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	
	  private static final String URL = "jdbc:postgresql://localhost:5432/bookshop";
	    private static final String USER = "postgres";
	    private static final String PASSWORD = "pass@123";

	    public static Connection getConnection() {
	        try {
	            return DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

}
