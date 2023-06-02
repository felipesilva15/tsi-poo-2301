/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Quadrado extends FormaGeometrica {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public Quadrado() {
        super();
    }
    
    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public String imprimir() {
        return super.imprimir() + ", lado = " + lado + ", área = "+ this.calcularArea();
    }
}
