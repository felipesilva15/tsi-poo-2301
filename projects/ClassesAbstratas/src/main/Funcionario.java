/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Funcionario {
    private String nome;
    private float salario;
    
    public Funcionario() {
    }
    
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public float getSalario() {
        return this.salario;
    }
    
    public void aumentarSalario(float perc) {
        this.salario += this.salario * perc / 100;
    }
    
    public String imprimir() {
        return String.format("Nome: %s, Salario: %.2f", this.getNome(), this.getSalario());
    }
}
