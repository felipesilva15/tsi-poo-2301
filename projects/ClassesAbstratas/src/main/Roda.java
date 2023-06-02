/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Roda {
    private int aro;
    private String marca;
    private double largura;
    private boolean cheio;
    
    public Roda(int aro, String marca, double largura){
        this.aro = aro;
        this.marca = marca;
        this.largura = largura;
    }
    
    public int getAro(){
        return this.aro;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public double getLargura(){
        return this.largura;
    }
    
    public void encher(){
        this.cheio = true;
    }
    
    public String imprimir(){
        return "Roda: { " +
                "Aro: " + this.aro +
                ", Marca: " + this.marca +
                ", Largura: " + this.largura +
                ", Cheio: " + (this.cheio ? "Sim" : "Não") +
                " }";
    }
}
