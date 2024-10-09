package configuration;

import java.sql.DriverManager;
import java.sql.Connection;

public class MyConnection {

    public static Connection cnx;

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:3306/cnss";
            String user="root";
            String password="baddiroot";
            cnx = DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("database connected");
        return cnx;
    }
}
