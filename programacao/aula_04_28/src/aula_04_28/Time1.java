/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_04_28;

/**
 *
 * @author profj
 */
public class Time1 {
    private int hour; // os valores podem ser de 0 até 23
    private int minute; // intervalo de 0 - 59 
    private int second; // intervalo de 0 - 59
    
    public Time1(){
        System.out.println("Classe instanciada");
        this.hour = 16;
    }
    public Time1(int valor){
        System.out.println("Classe instanciada");
        this.hour = valor;
    }
    public String toString(int valor) {
        return "22";
    }
    public String toString(){
        int formatteHour;
        String timeOfDay; 
        String formattedTime;
        if( this.hour == 0 || this.hour == 12){
            formatteHour = 12;
        } else {
            formatteHour = this.hour % 12;
        }
        if(hour < 12 ){
            timeOfDay = "AM"; 
        } else{
            timeOfDay = "PM";
        }
        // %d é decimal, %s é string 
        // %02d tamanho de dois decimais
        // %02.1d 
        formattedTime = String.format("%02d:%02d:%02d %s",
                formatteHour, this.minute, this.second, timeOfDay );
        return formattedTime; 
    }
    
    // sem controle de erro
    public void setTime1(int hour, int minute, int second){
        if( hour < 0 || hour >= 24 ||  
            minute < 0 || minute >= 60 || 
            second < 0 || second >= 60 ){
            System.out.println("parametro fora do range");
        } else {
           this.hour = hour;
           this.minute = minute;
           this.second = second;  
        }
    }
    // com controle de erro 
    public void setTime(int hour, int minute, int second){
        if( hour < 0 || hour >= 24 ||  
            minute < 0 || minute >= 60 || 
            second < 0 || second >= 60 ){
            throw new IllegalArgumentException("hora, minuto ou segundo está fora do range");
        } 
        this.hour = hour;
        this.minute = minute;
        this.second = second;  

    }
    public void getTime(){
        System.out.println( "hora    " + this.hour);
        System.out.println( "minuto  " + this.minute);
        System.out.println( "segundo " + this.second);
    }
}
