/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author gabri
 */
public class EletricoPokemon extends Pokemon {
    public EletricoPokemon(String nome, int energia, int forca){
        super(nome,energia,forca,"Eletrico");
    }
    
    @Override
    public int atacar(){
        return 0;
    }
}
