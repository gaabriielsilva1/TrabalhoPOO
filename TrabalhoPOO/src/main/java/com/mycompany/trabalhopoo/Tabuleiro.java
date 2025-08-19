/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo;

/**
 *
 * @author gabri
 */
public class Tabuleiro {
    private Pokemon[][] grade;
    private int tamanho;
    
    public Tabuleiro(int n){
        this.tamanho = n;
        grade = new Pokemon[n][n];
    }
    
    public void preencherRegioes(Pokedex Pokedex){
        
    }
    
    public Pokemon revelarCelula(int linha, int coluna){
        return grade[linha][coluna];
    }
}
