/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author felipe.ssantos80
 */
public class LivroDeBIblioteca extends Livro{
    String dataDevolucao, dataEmprestimo, nomeEmprestado;
    boolean emprestado;
    
    public void emprestar(String nome, String dataEmprestimo, String dataDevolucao, Livro livro){
        this.nome = livro.nome;
        this.autor = livro.autor;
        this.editora = livro.editora;
        this.paginas = livro.paginas;
        this.tipoCapa = livro.tipoCapa;
        
        this.nomeEmprestado = nome;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.emprestado = true;
    }
    
    public boolean estaEmprestado(){
        return this.emprestado;
    }
}
