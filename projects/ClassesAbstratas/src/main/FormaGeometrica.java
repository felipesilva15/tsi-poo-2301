/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public abstract class FormaGeometrica {
    private String nome;
    
    public FormaGeometrica() { }
    
    public FormaGeometrica(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract double calcularArea();

    public String imprimir() {
        return "FormaGeometrica: " + "nome = " + nome;
    }
}
