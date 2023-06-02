/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class IPVA {
    private double valorBase;
    private int quantidadeCavalos;
    
    public IPVA() {
    }
    
    public IPVA(double valorBase, int quantidadeCavalos) {
        this.valorBase = valorBase;
        this.quantidadeCavalos = quantidadeCavalos;
    }
    
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    
    public double getValorBase() {
        return this.valorBase;
    }
    
    public void setQuantidadeCavalos(int quantidadeCavalos) {
        this.quantidadeCavalos = quantidadeCavalos;
    }
    
    public int getQuantidadeCavalos() {
        return this.quantidadeCavalos;
    }
    
    public double calcularIPVA(){
        return this.getValorBase() * this.getQuantidadeCavalos();
    }
    
    public String imprimir() {
        return String.format("Valor base: %,.2f, Quantidade de cavalos: %d", this.getValorBase(), this.getQuantidadeCavalos());
    }
}
