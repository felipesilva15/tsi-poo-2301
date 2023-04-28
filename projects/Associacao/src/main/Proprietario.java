/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Proprietario {
    String nome;
    String telefone;
    
    public Proprietario(){
        
    }
    
    public Proprietario(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String imprimir(){
        return (String.format(" Nome: %s \n Telefone: %s", this.nome, this.telefone));
    }
}
