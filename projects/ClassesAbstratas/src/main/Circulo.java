/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo() {
        super();
    }
    
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }
    
    public double getRaio() {
        return this.raio;
    }
    
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * (this.raio * this.raio);
    }

    public String imprimir() {
        return super.imprimir() + ", raio = " + raio + ", área = "+ this.calcularArea();
    }
}
