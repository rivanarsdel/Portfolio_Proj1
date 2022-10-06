package utilities;

import models.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCConnection {

    private static Connection conn = null;

    //<><><><><>-----| H2 setup elements |-----<><><><><>\\
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";
    static final String USER = "sa";
    static final String PASS = "";

    //<><><><><>-----| End of H2 elements |-----<><><><><>\\



    public static Connection getConnection() {

        if (conn == null) {

            //<><><><><>-----| H2 setup for demo or testing |-----<><><><><>\\

            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }

            //<><><><><>-----| Remote Database Setup, utilizes resource file |-----<><><><><>\\

//            try {
//                InputStream input = JDBCConnection.class.getClassLoader().getResourceAsStream("connection.properties");
//                Properties props = new Properties();
//                props.load(input);
//
//                String endpoint = props.getProperty("endpoint");
//                String username = props.getProperty("username");
//                String password = props.getProperty("password");
//                String url = "";
//                conn = DriverManager.getConnection(url, username, password);
//
//            } catch (SQLException | IOException e) {
//                e.printStackTrace();
//            }

            return conn;
        }
        return null;
    }

    public static void main(String[] args) {
        Connection conn1 = getConnection();
        System.out.println(conn1);
    }
}
