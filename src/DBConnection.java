/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.sql.DriverManager;


public class DBConnection {
    
    Connection con;
    Statement stmt;
    public DBConnection()
    {

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.registerDriver((new oracle.jdbc.OracleDriver()));
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","c##ecop","ecop123");
            stmt=con.createStatement();//
//            con = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:XE [c##ecop on Default schema]",
//                    "c##ecop",
//                    "ecop123"
//            );

            System.out.println("Connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
