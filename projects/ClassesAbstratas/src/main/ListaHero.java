/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author felipe.ssantos80
 */
public class ListaHero {
    public static ArrayList<Hero> listaHero = new ArrayList<>(); 
    
    public static ArrayList<Hero> getListaHero(){
        return listaHero;
    }
    
    public static void adicionarHero(Hero hero, int index){
        listaHero.add(index, hero);
    }
    
    public static void adicionarHero(Hero hero){
        listaHero.add(hero);
    }
    
    public static String listarHeroes(){
        String retorno = "";
        
        for(Hero h : listaHero){
            retorno += h.imprimir() + "\n\n";
        }
        
        return retorno;
    }
    
    public static int buscarElemento(Hero hero){
        return listaHero.indexOf(hero);
    }
    
    public static Hero buscarElemento(String poder){
        for(Hero h : listaHero){
            if(h.getPoder().equalsIgnoreCase(poder)){
                return h;
            }
        }
        
        return null;
    }
    
    public static void removerElemento(int index){
        listaHero.remove(index);
    }
}
