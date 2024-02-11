/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeaula;

/**
 *
 * @author profj
 */
public class Time1 {
    private int hour;
    private int minute; 
    private int second; 
    
    public void setTime(int hour, int minute, int second){
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second <0 || second >= 60){
            throw new IllegalArgumentException("hora, inuto e/ou segundos esta fora do padrão");
        }
        this.hour = hour; 
        this.minute = minute; 
        this.second = second;
    }
    
    public String toString(){
        int formattedHour; 
        String timeOfDay; 
        String formattedTime; 
        
        if( hour == 0 || hour == 12){
            formattedHour = 12;
        } else {
            formattedHour = hour % 12;
        }
        if (hour <12){
            timeOfDay = "AM";
        } else {
            timeOfDay = "PM";
        }
        formattedTime = String.format("%d:%02d:%02d%s", formattedHour, minute, second, timeOfDay);
        return formattedTime;
    }
}
