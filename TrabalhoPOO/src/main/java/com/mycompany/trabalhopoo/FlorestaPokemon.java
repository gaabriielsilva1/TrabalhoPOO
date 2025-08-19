/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author gabri
 */
public class FlorestaPokemon extends Pokemon{
    public FlorestaPokemon(String nome, int energia, int forca){
        super(nome,energia,forca,"Floresta");
    }
    
    @Override
    public int atacar(){
        int dano = this.forca;
        int regeneracao = (int)(dano*0.2);
        this.energia += regeneracao;
        System.out.println(this.nome + "atacou e recuperou" + regeneracao + " de energia");
        return dano;
    }
}
