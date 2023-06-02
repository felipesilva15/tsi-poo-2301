/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Motor {
    private double torque, litragem;
    private int cilindros;
    private boolean ligado;
    
    public Motor(double torque, double litragem, int cilindros){
        this.torque = torque;
        this.litragem = litragem;
        this.cilindros = cilindros;
    }
    
    public double getTorque(){
        return this.torque;
    }
    
    public double getLitragem(){
        return this.litragem;
    }
    
    public float getCilindros(){
        return this.cilindros;
    }
    
    public String imprimir(){
        return "Motor: { " + 
               "Torque: " + this.torque + 
               ", Litragem: " + this.litragem + 
               ", Cilindros: " + this.cilindros + 
               ", Ligado: " + (this.ligado ? "Sim" : "Não") + 
               " }";
    }
    
    public void ligarDesligar(){
        this.ligado = !this.ligado;
    }
}
