/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * https://dbschema.com/jdbc-driver/MySql.html#Driver
 */
package aplicacao;

import controler.usuarioDao;
import modelos.UsuarioModel;

/**
 *
 * @author profj
 */
public class CrudExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        UsuarioModel usuario = new UsuarioModel(); 
        usuarioDao usuarioDao = new usuarioDao(); 
        
        usuario.setSenha("123456");
        usuario.setUsername("carmino");
        usuarioDao.save(usuario);  
    }
    
}
