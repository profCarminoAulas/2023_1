/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisao;

/**
 *
 * @author profj
 */
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorInicial = 0;
        int proximoValor = 15;
        int vetor[] = new int[10];
        int contador = 0;

        vetor[0] = 5;
        vetor[1] = 7;
        vetor[2] = 1;
        vetor[3] = 8;
        vetor[4] = 2;
        vetor[5] = 3;
        vetor[6] = 6;
        vetor[7] = 12;
        vetor[8] = 9;
        vetor[9] = 15;
        System.out.println("não ordenado");
        ImprimeVetor(vetor);

        while (proximoValor <= 9) {
            while (contador <= 9) {
                if (valorInicial == vetor[contador]) {
                    valorInicial = vetor[contador];
                    System.out.println("vetor inicial [" + valorInicial + " ]");
                    contador =0;
                    valorInicial = valorInicial + 1;
                } else {
                    contador = contador + 1;
                }
            }
            contador =0;
            proximoValor = proximoValor + 1;
            valorInicial = valorInicial + 1;

        }
        System.out.println("vetor deve estar ordenado");
        ImprimeVetor(vetor);
    }
    
    public static void ImprimeVetor( int v[]){
        for( int i = 0; i < v.length; i ++ ){
            System.out.println( v[i]);
        }
    }
    
    public static void Rev_IfWhile(){
        // este é um comentário 
        int a = 14, b =12, contador; 
        if((a > b)) { // 14 > 12 = true ! false 
            contador = 1;
            while(contador <= 1000){
                System.out.println("verdadeiro " + contador);
                contador = contador + 1;
            }
        } else { 
            for( contador=1; contador <= 1000; contador=contador + 1 ){
                System.out.println("for falso " + contador);
            }
        }
    }
    
    public static void Alogirmto(){
        // TODO code application logic here
        int valorInicial = 0;
        int proximoValor = 15;
        int vetor[] = new int[10];
        int contador = 0;

        vetor[0] = 5;
        vetor[1] = 7;
        vetor[2] = 1;
        vetor[3] = 8;
        vetor[4] = 2;
        vetor[5] = 3;
        vetor[6] = 6;
        vetor[7] = 12;
        vetor[8] = 9;
        vetor[9] = 15;


        while (proximoValor <= 9) {
            while (contador <= 9) {
                if (valorInicial == vetor[contador]) {
                    valorInicial = vetor[contador];
                    System.out.println("vetor inicial [" + valorInicial + " ]");
                    contador =0;
                    valorInicial = valorInicial + 1;
                } else {
                    contador = contador + 1;
                }
            }
            contador =0;
            proximoValor = proximoValor + 1;
            valorInicial = valorInicial + 1;

        }
    }
    
    public static void Ordenacao(){
        int vetor[] = new int[5]; // este é um vetor com 5 elementos
        vetor[0] =4; 
        vetor[1] =5;
        vetor[2] =6;
        vetor[3] =3;
        vetor[4] =2;
        
        int contador=0; 
        for(contador=0; contador <= 4; contador++){ // contador = contador + 1
             System.out.println("for valor do vetor[" + contador + "]=" +
                     vetor[contador]);
        }
        contador = 0; 
        while(contador <= 4){ 
            System.out.println("while valor do vetor[" + contador + "]=" +
                     vetor[contador]);
            contador++; // equivale a contador = contador + 1
        }
        int valoratual = 0; 
        int contador2 = 0; 
        int vartemp =0; 
        contador = 0;
        
        while(contador <= 4) {
            valoratual = vetor[contador]; 
            contador2 = contador+1; 
            while(contador2 <= 4){
                if( valoratual > vetor[contador2]){
                    vartemp = vetor[contador2]; 
                    vetor[contador2] = valoratual; 
                    valoratual = vartemp; 
                }
                contador2++; 
            }
            vetor[contador] = valoratual;
            contador++; 
        }
        contador = 0; 
        while(contador <= 4){ 
            System.out.println("ordenado valor do vetor[" + contador + "]=" +
                     vetor[contador]);
            contador++; // equivale a contador = contador + 1
        }
    }
}
