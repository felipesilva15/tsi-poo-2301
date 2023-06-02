/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class IPVACaminhao extends IPVA {
    private int quantidadeEixos;
    
    public IPVACaminhao() {
    }
    
    public IPVACaminhao(double valorBase, int quantidadeCavalos, int quantidadeEixos) {
        super(valorBase, quantidadeCavalos);
        this.quantidadeEixos = quantidadeEixos;
    }
    
    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }
    
    public int getQuantidadeEixos() {
        return this.quantidadeEixos;
    }
    
    @Override
    public double calcularIPVA() {
        return super.calcularIPVA() * this.getQuantidadeEixos();
    }
    
    @Override
    public String imprimir() {
        return String.format("%s, Quantidade de eixos: %d", super.imprimir(), this.getQuantidadeEixos());
    }
}
