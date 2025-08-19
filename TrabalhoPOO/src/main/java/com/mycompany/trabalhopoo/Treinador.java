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
public class Treinador {
    private String nome;
    private List<Pokemon> time;
    private List<Pokemon> mochila;
    private int pontuacao;
    
    public Treinador(String nome, Pokemon inicial){
        this.nome = nome;
        this.time = new ArrayList<>();
        this.mochila = new ArrayList<>();
        this.time.add(inicial);
        this.pontuacao = 0;
    }
    
    public void capturar(Pokemon p){
        p.setSelvagem(false);
        mochila.add(p);
        time.add(p);
    }
    
    public void batalhar(Pokemon adversario){
        
    }
    
    public Pokemon escolherPokemon(){
        return null;
    }
}
