/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author profj
 */
public class ConexaoMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/filme";
    private static final String USUARIO = "root"; 
    private static final String SENHA = "";
    
    public static Connection ObterConexao(){
        Connection conexao = null; 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e){
            System.out.println("O driver do MySql não foi encontrado" + e.getMessage());
        } catch (SQLException e){
            System.out.println("Erro ao conectar com o banco de dados");
        }
        return conexao;
    }
    
    
    
    public static void fecharConexao( Connection conexao){
        if( conexao != null ){
            try{
                conexao.close();
            } catch(SQLException e) {
                System.out.println("Erro ao fechar a conexao");
            }
        }
    }
}

