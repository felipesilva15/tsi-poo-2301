/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Hero {

    private String nome; //atributos
    private String poder;

    //Construtores
    public Hero() {
    } //default

    public Hero(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
    }

    //Métodos de Acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    //Métodos da classe
    public String imprimir() {
        return "Hero: " + nome + "\nPoder: " + poder;
    }
}
