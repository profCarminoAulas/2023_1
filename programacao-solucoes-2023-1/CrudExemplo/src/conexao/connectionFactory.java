/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author profj
 */
public class connectionFactory {
   private static final String USERNAME = "root";
    private static final String PASSWORD="";
    private static final String DATABASE_URL = "jdbc:mysql://192.168.0.161//loja";
    public static Connection createConnectionToMySQL() throws Exception{
        Class.forName ("com.mysql.cj.jdbc");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        return connection;
    } 
    
    public static void main(String[] args) throws Exception {
        Connection con = createConnectionToMySQL();
        if(con!= null){
            System.out.println("Conexão obtida");
            con.close();
        }
    }
}
