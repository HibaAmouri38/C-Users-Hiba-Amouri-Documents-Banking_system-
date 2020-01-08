/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author njoud
 */

import static java.lang.Class.*;
import java.sql.*;
import javax.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    
    Connection conn=null;
    
    public static Connection connecrdb()
    {
        try{
            //javaconnect.
            Class.forName("org.sqlite.JDBC");
                   // class.forName("org.sqlite.JDBC");
                   System.out.println("njoud");
                Connection conn=  DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Hiba Amouri\\Documents\\Banking_system~\\Banking_system\\bank.db") ;
             System.out.println("njoud");
                return conn;
        }   
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
