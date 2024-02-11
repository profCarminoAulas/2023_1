/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicadetroco_03_17;

/**
 *
 * @author profj
 */
public class LogicaDeTroco_03_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nery();
    }

    public static void neryFor(int troco) {
        int resto = 0;
        int total_notas = 0;
        int notas[] = new int[7];
        notas[0] = 200;
        notas[1] = 100;
        notas[2] = 50;
        notas[3] = 20;
        notas[4] = 10;
        notas[5] = 5;
        notas[6] = 2;
        for (int contador = 0; contador <= 6; contador = contador + 1) {
            resto = troco % notas[contador];
            total_notas = (troco - resto) / notas[contador];
            if (total_notas != 0) {
                System.out.println("Notas " + notas[contador]
                        + " "
                        + resto
                        + " total notas " + total_notas
                        + " contador " + contador);
            }
            troco = resto;
            if (troco == 0) {
                contador = 10;
            }
        }
    }

    public static void nery() {
        int resto = 0;
        int total_notas = 0;
        int troco = 1282;
        int totalcaixa = 0;
        int contador = 0;
        int notas[] = new int[7];
        notas[0] = 200;
        notas[1] = 100;
        notas[2] = 50;
        notas[3] = 20;
        notas[4] = 10;
        notas[5] = 5;
        notas[6] = 2;
        int quantnotas[] = new int[7];
        quantnotas[0] = 1;
        quantnotas[1] = 5;
        quantnotas[2] = 10;
        quantnotas[3] = 2;
        quantnotas[4] = 10;
        quantnotas[5] = 7;
        quantnotas[6] = 100;

        while (contador <= 6) {
            totalcaixa = totalcaixa
                    + (quantnotas[contador] * notas[contador]);
            contador = contador + 1;
        }

        System.out.println("o total do caixa é " + totalcaixa);
        if (troco <= totalcaixa) {
            contador = 0;
            while (contador >= 0 && contador <= 6) {
                total_notas = (troco - (troco % notas[contador])) 
                        / notas[contador];
                if( total_notas >= quantnotas[contador] ){
                    resto = troco - 
                        (notas[contador] * quantnotas[contador]);
                } else {
                    resto = troco % notas[contador];
                }
                if (total_notas != 0) {
                    System.out.println("Notas " + notas[contador]
                            + " resto "
                            + resto
                            + " total notas " + total_notas
                            + " contador " + contador);
                }
                troco = resto;
                if (troco == 0) {
                    contador = 10;
                } else {
                    contador = contador + 1;
                }
            }
        } else {
            System.out.println("não tenho cedulas necessário para esta operação");
        }
    }
    
}
