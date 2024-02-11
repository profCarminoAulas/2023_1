/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeaula;

/**
 *
 * @author profj
 */
public class TesteAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time1 time = new Time1();
        displayTime("antes do objeto time ser criado", time);
        try{
            time.setTime(99, 99, 99);
        } catch( IllegalArgumentException e){
            System.out.printf("erro encontrado ", e.getMessage());      
        }
        displayTime("após ser atribuido um valor invalido", time);
    }
    
    private static void displayTime( String mensagem, Time1 t){
        System.out.printf("%s%n hora: minuto: %s%n hora: %s%n ", mensagem, t.toString(), t.toString());
    }
    
}
