package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCConnection {

    private static Connection conn = null;

    public static Connection getConnection() {

        if(conn == null) {

            try {

                InputStream input = JDBCConnection.class.getClassLoader().getResourceAsStream("connection.properties");

                Properties props = new Properties();
                props.load(input);

                // Credentials for remote database go in local file "connection.properties" and require appending in DriverManager constructor
//                String endpoint = props.getProperty("endpoint");
//                String username = props.getProperty("username");
//                String password = props.getProperty("password");

                String url = "jdbc:h2:mem:";

                conn = DriverManager.getConnection(url);

            } catch (SQLException | IOException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    //Just a test for JDBC Connection
    public static void main(String[] args) {

        Connection conn1 = getConnection();
        System.out.println(conn1);

    }
}
