/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_04_28;

/**
 *
 * @author profj
 */
public class Aula_04_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time1 time = new Time1();
        Time1 time1 = new Time1(22);
        //time.hour = 12;
        //time.minute = 45;
        //time.second = 55;
        time.getTime(); // ler o valor atual do objeto
        time1.getTime(); // ler o valor atual do objeto
        int valor = 1; 
        System.out.println("----- certo");
        try{
            time.setTime(valor, 45, 56); // atribuição
        } catch( IllegalArgumentException e){
            System.out.println("erro: " + e.getMessage());
        }
        time.getTime(); // ler o valor atual do objeto
        System.out.println(time.toString());
    }
    
}
