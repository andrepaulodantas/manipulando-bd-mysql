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
public class Estaticos {
    public static void main(String[] args){
        SalaDeAula.professor = "Andre";
        SalaDeAula.ensinar();
        
        SalaDeAula a1 = new SalaDeAula();
        a1.aluno = "Juliana";
        System.out.println(a1.professor);
        
        SalaDeAula a2 = new SalaDeAula();
        a2.aluno = "Larissa";
        System.out.println(a2.professor);
    }
    
}



