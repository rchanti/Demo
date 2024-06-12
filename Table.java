package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "Chanti@444";

        // JDBC variables for opening, closing, and managing a connection
        Connection connection = null;
        Statement statement = null;

        try {
            // Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to MySQL server...");
            connection = DriverManager.getConnection(url, user, password);

            // Execute a query to create the latest version of the database
            System.out.println("Creating the latest database...");
            statement = connection.createStatement();
            //String dbName = "latest_database";
            String createDatabaseQuery = "drop DATABASE ravipati" ;//+ dbName;
            statement.executeUpdate(createDatabaseQuery);
            System.out.println("Latest database created successfully.");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
    }
}
