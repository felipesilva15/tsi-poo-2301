/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Animal {
    String nome;
    String raca;
    String cor;
    int anoDeNascimento;
    Proprietario proprietario;
    
    public Animal(){
        
    }
    
    public Animal(String nome, String raca, String cor, int anoDeNascimento, Proprietario proprietario){
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.anoDeNascimento = anoDeNascimento;
        this.proprietario = proprietario;
    }
    
    public String imprimir(){
        return (String.format("Nome: %s \nRaca: %s \nCor: %s \nAno de nascimento: %d \nProprietario: { \n%s \n}", this.nome, this.raca, this.cor, this.anoDeNascimento, this.proprietario.imprimir()));
    }
}
