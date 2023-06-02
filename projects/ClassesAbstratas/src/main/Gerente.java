/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author felipe.ssantos80
 */
public class Gerente extends Funcionario {
    private int numeroFuncionarios;
    
    public Gerente() {
        super();
    }
    
    public Gerente(String nome, float salario, int numeroFuncionarios) {
        super(nome, salario);
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    public int getNumeroFuncionarios() {
        return this.numeroFuncionarios;
    }
    
    @Override
    public void aumentarSalario(float perc) {
        super.aumentarSalario(perc + 20);
    }
    
    @Override
    public String imprimir(){
        return String.format("%s, Numero de funcionários: %d", super.imprimir(), this.getNumeroFuncionarios());
    }
}
