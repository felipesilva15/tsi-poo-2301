/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        
        endereco.setLogradouro("Rua dos canarinhos");
        endereco.setComplemento("Casa");
        endereco.setNumero(169);
        endereco.setCep("48956-565");
        
        Pessoa felipe = new Pessoa("Felipe", 19, 'M');
        felipe.setEnd(endereco);
        
        System.out.println(felipe.imprimir());
    }
    
    public static void aulasPassadas(){
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
}
