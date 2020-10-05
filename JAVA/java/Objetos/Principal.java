/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import Teste.Animal;
/**
 *
 * @author 15112683
 */
public class Principal {
    public static void main(String[] args){
        Pessoa objeto = new Pessoa();
        System.out.println(objeto.nome);
        
        Animal objeto = new Animal();
        System.out.println(objeto.tipo);
        objeto.fazerBarulho();
        
    }
}





