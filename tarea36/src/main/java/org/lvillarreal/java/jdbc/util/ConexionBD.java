package org.lvillarreal.java.jdbc.util;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

        private static String url = "jdbc:mysql://localhost:3306/java_curso";
        private static String usuario = "root";
        private static String password = "sasa";
        private static Connection connection;

public static Connection getConnection () throws SQLException {
    return DriverManager.getConnection(url, usuario, password);
}

}
