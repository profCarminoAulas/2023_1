/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import conexao.connectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.UsuarioModel;

/**
 *
 * @author profj
 */
public class usuarioDao {
    public void save(UsuarioModel usuario) throws Exception {
        String sql = "select * from usuario where username=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        try {
            conn = connectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, usuario.getUsername() );
            rset = pstm.executeQuery();
            if (rset.next()) {
                System.out.println(rset.getString(1));
                System.out.println(rset.getString(2));
            } else {
                System.out.println("registro não encontrado"); 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
