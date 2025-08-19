/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author gabri
 */
public class TerraPokemon extends Pokemon{
    private int turno = 1;
    
    public TerraPokemon(String nome, int energia, int forca){
        super(nome,energia,forca,"Terra");
    }
    
    @Override
    public int atacar(){
        int dano = (turno % 2 != 0) ? this.forca * 2 : this.forca;
        turno++;
        System.out.println(this.nome + " atacou com dano " + dano + " no turno " + turno);
        return dano;
        
    }
}
