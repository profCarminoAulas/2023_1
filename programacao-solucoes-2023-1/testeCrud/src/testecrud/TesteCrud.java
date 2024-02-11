/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testecrud;

import Controller.LoginDao;
import Modelos.LoginModel;

/**
 *
 * @author profj
 */
public class TesteCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        LoginDao testeLogin = new LoginDao(); 
        LoginModel login = new LoginModel(); 
        login.setUsername("carmino");
        login.setSenha("12345");
        
        if( testeLogin.Logar(login) ) {
            System.out.println("dados corretos");
        } else { 
            System.out.println("dados incorretos"); 
        }
    }
    
}
