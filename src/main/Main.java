/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import static java.lang.Math.abs;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
           
//        System.out.println("Digite um número:");
//        int n = sc.nextInt(10);
//        int soma = 0;
//        
//        for(int i = 1; i <= n; i++){
//            soma = soma * i;
//        }
//        
//        System.out.println(soma);
        
//        System.out.println("Digite a quantidade de notas:");
//        int tamanho = sc.nextInt();
//
//        int notas[] = new int[tamanho];
//        double acumulador = 0;
//        
//        
//        for(int i = 0; i < notas.length; i++){
//            System.out.println("Digite a nota " + (i + 1) + ":");
//            
//            notas[i] = sc.nextInt();
//        }
//        
//        for(int nota : notas){
//            acumulador += nota;
//        }
//        
//        System.out.println(acumulador / notas.length);

//        int impares [] = new int[10];
//        int numeros = 0;
//        
//        for(int i = 0; numeros + 1 < 10;i++){
//            if(i % 2 > 0){
//                impares[numeros] = i;
//                
//                numeros++;
//            }
//        }
        
//        int impares [] = new int[20];
//        int index = 0;
//        
//        for(int i = 0; index < impares.length; i++){
//            if(i % 2 != 0){
//                impares[index] = i;
//                
//                index++;
//            }
//        }
//        
//        System.out.println(Arrays.toString(impares));
//        
//        System.out.println("Digite um número para busca:");
//        int procura = sc.nextInt();
//        
//        int posicaoEncontrada = 0;
//        
//        for(int i = 0; i < impares.length; i++){
//            if(impares[i] == procura){
//                posicaoEncontrada = i;
//            }
//        }
//        
//        if(posicaoEncontrada == 0){
//            System.out.println("Número não encontrado no vetor!");
//        } else{
//            System.out.println("O " + procura + " se encontra na posição " + posicaoEncontrada);
//        }

//        int []vetorInteiros = {10,20,30,40,50};
//        
//        for(int i = 0; i < vetorInteiros.length; i++){
//            System.out.print(vetorInteiros[i] + " ");
//        }
//        
//        modificar(vetorInteiros);
//        
//        System.out.println("\n=== Vetor após a chamada do método ===");
//        
//        for(int i = 0; i < vetorInteiros.length; i++){
//            System.out.print(vetorInteiros[i] + " ");
//        }

//        int vetorInteiros[] = new int[10];
//        
//        lerVetor(vetorInteiros);
//        
//        System.out.println("Vetor preenchido:");
//        for(int i = 0; i < vetorInteiros.length; i++){
//            System.out.print(vetorInteiros[i] + " ");
//        }
//        
//        System.out.println("\nSoma dos valores do vetor: " + somarNumeros(vetorInteiros));
//        
//        System.out.println("Média aritimética dos valores do vetor: " + calcularMedia(vetorInteiros));
        
        Scanner sc = new Scanner(System.in, "latin1");
        
        String frutas[] = {"carambola", "maça", "pera", "uva", "laranja", "goiaba", "ameixa", "mamão", "melancia", "framboesa", "pitanga", "açaí", "graviola", "banana", "maracujá"};
    
        System.out.println("Pesquise uma fruta pelo nome");
        String nome = sc.next();
        
        System.out.println(pesquisar(frutas, nome));
        
        System.out.println("Pesquise uma fruta pelo índice");
        int indice = sc.nextInt();
        
        System.out.println(pesquisar(frutas, indice));
        
        System.out.println("Pesquise uma fruta pelo caractere");
        char caractere = sc.next().charAt(0);
        
        String frutasFiltradas[] = pesquisar(frutas, caractere);

        System.out.println(Arrays.toString(frutasFiltradas));
    }
    
    static void modificar(int []vetor){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = vetor[i] / 2;
        }
    }
    
    static void lerVetor(int vetor[]){
        Random random = new Random();
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = abs(random.nextInt()) / 10000000;
        }
    }
    
    static int somarNumeros(int vetor[]){
        int soma = 0;
        
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        
        return soma;
    }
    
    static float calcularMedia(int vetor[]){
        return somarNumeros(vetor) / vetor.length;
    }
    
    static boolean pesquisar(String frutas[], String busca){
        for(String fruta : frutas) {
            if (fruta.equals(busca)){
                return true;
            }
        }
        
        return false;
    }
    
    static String pesquisar(String frutas[], int indice){
        if(indice > frutas.length || indice < 0){
            return null;
        }
        
        return frutas[indice];
    }
    
    static String[] pesquisar(String frutas[], char caractere){
        String frutasFiltradas[] = new String[frutas.length];
        int ultPosicao = 0;
                
        for(String fruta : frutas){
            if(fruta.indexOf(caractere) >= 0){
                frutasFiltradas[ultPosicao] = fruta;
                ultPosicao += 1;
            }
        }
        
        return frutasFiltradas;
    }
}
