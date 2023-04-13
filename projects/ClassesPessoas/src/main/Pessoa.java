/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Pessoa {
    String nome = "";
    int idade = 0;
    char sexo = ' ';
    
    public Pessoa(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String imprimir(){
        // return (String.format("Nome: %s \nIdade: %d \nSexo: %c", this.nome, this.idade, this.sexo));
        return (String.format("{\"nome\":\"%s\",\"idade\":%d,\"sexo\":\"%c\"}", this.nome, this.idade, this.sexo));
    }
}
