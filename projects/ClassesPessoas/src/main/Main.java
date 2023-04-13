/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa("Felipe", 19, 'M');

        System.out.println(objPessoa.imprimir());
        
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
}