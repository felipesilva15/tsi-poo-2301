/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Time {
    private int hora, minuto, segundo;
    
    public Time(int hora, int minuto, int segundo){
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }
    
    public int getHora(){
        return this.hora;
    }
    
    public void setHora(int hora){
        if(hora >= 0 && hora < 24)
            this.hora = hora;
    }
    
    public int getMinuto(){
        return this.minuto;
    }
    
    public void setMinuto(int minuto){
        if(minuto >= 0 && minuto < 60)
            this.minuto = minuto;
    }
    
    public int getSegundo(){
        return this.segundo;
    }
    
    public void setSegundo(int segundo){
        if(segundo >= 0 && segundo < 60)
            this.segundo = segundo;
    }
        
    public String imprimir(){
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
    
    public String visualizarHoraUniversal(){
        return String.format("%02d:%02d:%02d horas", this.hora, this.minuto, this.segundo);
    }
    
    public String visualizarHoraAmPm(){
        String amPm = this.hora >= 12 ? "PM" : "AM";
        int hora = this.hora > 12 ? this.hora - 12 : this.hora;
        
        return String.format("%02d:%02d:%02d %s", hora, this.minuto, this.segundo, amPm);
    }
}
