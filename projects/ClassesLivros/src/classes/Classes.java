/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author felipe.ssantos80
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro livro = new Livro();
        
        livro.nome = "Alice no País das Maravilhas";
        livro.editora = "Darkside";
        livro.autor = "Lewis Carroll";
        livro.paginas = 244;
        livro.tipoCapa = "Dura";
        
        LivroDeBIblioteca livroEmprestimo = new LivroDeBIblioteca();
        
        livroEmprestimo.emprestar("Felipe", "06/04/2023", "13/04/2023", livro);
        
        System.out.println(livroEmprestimo.estaEmprestado());
    }
    
}
