/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filme;

import java.sql.Connection; 
import java.sql.SQLException;
import Modelos.ConexaoMySQL; 
 

/**
 *
 * @author profj
 */
public class Filme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conexao = null;
        conexao = ConexaoMySQL.ObterConexao();
        if( conexao != null ){
            System.out.println("Conexao com o banco de dados feita");
            ConexaoMySQL.fecharConexao(conexao);
            System.out.println("Conexao encerrada");
        }
    }
    
}
