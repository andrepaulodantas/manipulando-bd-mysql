/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author 15112683
 */
public class Sobrecarga {
    String nome;
    int idade;
    
    Sobrecarga(String nome){
        this.nome = nome;
    }
    
    Sobrecarga(String nome, int idade){
        this(nome);
        this.idade = idade;
    }
    
    public static void main(String[] args){
        Sobrecarga objeto = new Sobrecarga("André", 33);
        System.out.println(objeto.nome);
    }
}







