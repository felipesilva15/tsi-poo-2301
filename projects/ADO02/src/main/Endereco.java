/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Endereco {
    public String logradouro;
    public String complemento;
    public int numero;
    public String cep;
    
    public Endereco(){
        
    }
    
    public Endereco(String logradouro, String complemento, int numero, String cep){
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
    }
    
    public String getLogradouro(){
        return this.logradouro;
    }
    
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public String getComplemento(){
        return this.complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String imprimir(){
        return  " Logradouro: " + this.logradouro +
                "\n Complemento: " + this.complemento +
                "\n Número: " + this.numero + 
                "\n CEP: " + this.cep;
    }
}
