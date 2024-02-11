/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author profj
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double altura = 1;
        double somaAlturaM = 0;  //altura masculina, será armazenado e somado todos para calcular a média
        double somaAlturaF = 0;  //altura feminina, será armazenado e somado todos para calcular a média
        int sexo = 0;        //1 para Masculino e 2 para feminino
        double mediaM = 0;   //media das alturas masculinas
        double mediaF = 0;   //altura masculina, será armazenado e somado todos para calcular a média
        int porcentoM = 0;   //porcetagem 
        int porcentoF = 0;   //porcentagem
        double qtdM = 0;        //quantidade de homens
        double qtdF = 0;        //quantidade de mulheres
        double maiorAltura = 0;   //Maior altura
        double menorAltura = 10000;   //Menor altura

        while (altura > 0) {
            System.out.println("Qual sua altura?");
            altura = sc.nextDouble();
            if (altura > 0) {
                System.out.println("Qual seu Sexo? | 1 para masculino e 2 para feminino");
                sexo = sc.nextInt();
                if(menorAltura > altura ){
                   menorAltura = altura;  
                }
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
                
                if(sexo == 2){
                    qtdF = qtdF + 1;
                    somaAlturaF = somaAlturaF + altura;
                }
                if(sexo == 1){
                    qtdM = qtdM + 1;
                    somaAlturaM = somaAlturaM + altura;
                }
            }
        }
        System.out.println("A maior altura e: " + maiorAltura);
        System.out.println("A menor altura e: " + menorAltura);
        System.out.println("A media de altura das mulheres é: " + (somaAlturaF / qtdF));
        System.out.println("A media de altura dos homens é: " + (somaAlturaM / qtdM));
        System.out.println("Percentual de homes " + (qtdM/(qtdF+qtdM)) );
    }
    
}
