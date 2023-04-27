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
    public String nome;
    public int idade;
    public char sexo;
    public Endereco end;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public Endereco getEnd(){
        return this.end;
    }
    
    public void setEnd(Endereco end){
        this.end = end;
    }
    
    public String imprimir(){
        return (String.format("Nome: %s \nIdade: %d \nSexo: %c \nEndereco: { \n%s }", this.nome, this.idade, this.sexo, this.end.imprimir()));
        // return (String.format("{\"nome\":\"%s\",\"idade\":%d,\"sexo\":\"%c\"}", this.nome, this.idade, this.sexo));
    }
}
