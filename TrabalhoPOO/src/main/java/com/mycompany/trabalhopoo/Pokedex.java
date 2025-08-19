/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gabri
 */
public class Pokedex {
    private List<Pokemon> lista;
    public Pokedex(){
        this.lista = new ArrayList<>();
    }
    
    public void adicionar(Pokemon p){
        lista.add(p);
    }
    
    public List<Pokemon> getLista(){
        return lista;
    }
    
    public Pokemon getPokemonPorNome(String nome){
        return null;
    }
}
