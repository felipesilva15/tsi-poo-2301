/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Executa o método da aula desejada
        aulaAssociacaoPt02();
    }
    
    public static void aulaClassePessoa(){
        // Classe pessoa
        Pessoa maria = new Pessoa("Maria", 19);
        System.out.println(maria.imprimir() + "\n");

        Pessoa joao = new Pessoa("João", 15, 'M');
        System.out.println(joao.imprimir() + "\n");

        Pessoa objPessoa = new Pessoa();
        System.out.println(objPessoa.imprimir() + "\n");

        // Classe lâmpada
        Lampada objLampada = new Lampada();

        objLampada.modelo = "E2779";
        objLampada.marca = "Philips";
        objLampada.tipo = "LED";
        objLampada.casquilho = "Rosca";
        objLampada.cor = "Branca";
        objLampada.formato = "Pera";
        objLampada.voltagem = 110;
        objLampada.temperatura = 6000;
        objLampada.watts = 4.5;
    }
    
    public static void aulaClasseTime(){
        // Classe time
        Time horaEvento = new Time(6, 30, 0);
        System.out.println("A hora do evento é " + horaEvento.imprimir());

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas");
        int hora = sc.nextInt();

        System.out.println("Digite os minutos");
        int minuto = sc.nextInt();

        System.out.println("Digite os seguntos");
        int segundo = sc.nextInt();

        Time horario = new Time(hora, minuto, segundo);

        System.out.println("O horário universal é " + horario.visualizarHoraUniversal());
        System.out.println("O horário em AM/PM é " + horario.visualizarHoraAmPm());
    }
    
    public static void aulaClasseHero(){
        Scanner entrada = new Scanner(System.in);
        
        Hero listaHero[] = new Hero[5];
        
        Hero hero; //referencia para classe Hero
        int i;
        String nome, poder;
        
        for (i = 0; i < listaHero.length; i++) {
            System.out.println("==> Dados do Hero " + (i + 1) + ":");
            
            System.out.println("Heroi? ");
            nome = entrada.nextLine();
            
            System.out.println("Poder? ");
            poder = entrada.nextLine();
            
            //chama o construtor com parâmetros
            hero = new Hero(nome, poder);
            
            //armazena a referencia do objeto no vetor
            listaHero[i] = hero;
        }
        
        System.out.println("=== HEROIS CADASTRADOS ===");
        
        for (Hero h : listaHero) {
            System.out.println(h.imprimir() + "\n");
        }
    }
    
    public static void aulaAssociacaoPt01(){
        // Aula sobre associação
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        
        System.out.println("Digite o CEP do endereco:");
        String cep = scString.nextLine();
        
        System.out.println("Digite o logradouro do endereco:");
        String logradouro = scString.nextLine();
        
        System.out.println("Digite o complemento do endereco:");
        String complemento = scString.nextLine();
        
        System.out.println("Digite o número do endereco:");
        int numero = scInt.nextInt();
        
        Endereco endereco = new Endereco(logradouro, complemento, numero, cep);
        
        System.out.println("Digite o nome:");
        String nome = scString.nextLine();
        
        System.out.println("Digite a idade:");
        int idade = scInt.nextInt();

        System.out.println("Digite o sexo:");
        char sexo = scString.nextLine().charAt(0);
        
        Pessoa felipe = new Pessoa(nome, idade, sexo, endereco);
        
        System.out.println(felipe.imprimir());
    }
    
    public static void aulaAssociacaoPt02(){
        // Instancia os scanners
        Scanner scString = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        
        // Instancia as variáveis
        int i, anoDeNascimento, qtdAnimais;
        String nome, raca, cor, nomeProp, telefone;
        Animal animal;
        
        // Obtém os dados e cria a classe de proprietário
        System.out.println("Nome do proprietário:");
        nomeProp = scString.nextLine();
        
        System.out.println("\nTelefone do proprietário:");
        telefone = scString.nextLine();
        
        Proprietario proprietario = new Proprietario(nomeProp, telefone);
        
        // Cria o vetor de animais
        System.out.println("\nQual a quantidade de animais?");
        qtdAnimais = scInt.nextInt();
        
        ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
        
        // Preenche o vetor de animais
        for (i = 0; i < qtdAnimais; i++) {
            System.out.println("\n==> Dados do " + (i + 1) + "º animal:");
            
            // Obtém os dados dos animais
            System.out.println("\nNome:");
            nome = scString.nextLine();
            
            System.out.println("\nRaça:");
            raca = scString.nextLine();
            
            System.out.println("\nCor:");
            cor = scString.nextLine();
            
            System.out.println("\nAno de nascimento:");
            anoDeNascimento = scInt.nextInt();
            
            // Instancia a classe de animal com o dados obtidos
            animal = new Animal(nome, raca, cor, anoDeNascimento, proprietario);
            
            //armazena a referencia do objeto no vetor
            listaAnimais.add(animal);
        }
        
        System.out.println("\n=== Animais cadastrados ===");
        
        // Exibe os animais cadastrados
        listaAnimais.forEach((item) -> {
            System.out.println("\n" + item.imprimir());
        });
    }
}
