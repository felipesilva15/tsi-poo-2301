/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author felipe.ssantos80
 */
public class Carro {
    private String marca, modelo; 
    private int velocidade;
    private Motor motor;
    private ArrayList<Roda> rodas;
    
    public Carro(String marca, String modelo, Motor motor, ArrayList<Roda> rodas){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.rodas = rodas;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public Motor getMotor(){
        return this.motor;
    }
    
    public ArrayList<Roda> getRodas(){
        return this.rodas;
    }
    
    public void acelerar(){
        if(this.velocidade == 140){
            return;
        }
        
        this.velocidade += 10;
    }
    
    public void frear(){
        if(this.velocidade == 0){
            return;
        }
        
        this.velocidade -= 10;
    }
    
    public String imprimir(){
        String rodas = "";
        
        for(Roda r : this.getRodas()){
            rodas = r.imprimir() + ", ";
        }
        
        return "Carro: { " +
               "Marca: " + this.marca + 
               ", Modelo: " + this.modelo + 
               ", Velocidade: " + this.velocidade +
               ", " + this.getMotor().imprimir() + 
               ", Rodas: [" + 
               rodas + 
               "]" +
               " }";
    }
}
