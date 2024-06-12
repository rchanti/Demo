package JDBC;

import java.sql.*;

public class prac {
   public static void main(String[] args) {
      String url = "jdbc:mysql://localhost:3306/chanti";  // connection URL
      String username="root";
      String password="Chanti@444";
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection(url,username,password);
         Statement statement=connection.createStatement();
         ResultSet resultset =statement.executeQuery("select * from student");
         while(resultset.next())
         {
            System.out.println(resultset.getInt(1)+"| Serial no: "+resultset.getString(2)+"| Name: "+resultset.getInt(3)+"|  age:"+resultset.getInt(4)+"| Marks:"+resultset.getString(5));
         }
         connection.close();
      }
      catch(Exception e)
      {
         System.out.println(e);
      }
   }
}