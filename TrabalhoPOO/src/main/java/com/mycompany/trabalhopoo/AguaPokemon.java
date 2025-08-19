/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author gabri
 */
public class AguaPokemon extends Pokemon{
    public AguaPokemon(String nome, int energia, int forca){
        super(nome,energia,forca,"Agua");
    }
    @Override
    public int atacar(){
        return 0;
    }
}
