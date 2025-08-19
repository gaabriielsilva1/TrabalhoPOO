/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author gabri
 */
public abstract class Pokemon {
    protected String nome;
    protected int energia;
    protected int forca;
    protected int experiencia;
    protected int nivel;
    protected String tipo;
    protected boolean selvagem;


    public Pokemon(String nome, int energia, int forca, String tipo) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
        this.tipo = tipo;
        this.experiencia = 0;
        this.nivel = 1;
        this.selvagem = true;
        }
    
    public abstract int atacar();
    
    public void ganharExperiencia(int valor){
        this.experiencia += valor;
    }
    
    public void subirDeNivel(){
        if(this.experiencia == 100){
            this.nivel++;
            this.experiencia = 0;
        }
    }
    
    public void setSelvagem(boolean selvagem){
        this.selvagem = selvagem;
    }
    
    
}
