/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

/**
 *
 * @author 15112683
 */
public class Separar {
        public static void main(String[] args){
            String nome = "Juliana Patrícia Graciano Pessoa de Araújo";
            String[] nomes = nome.split(" ", 3);
            System.out.println(nomes[2]);
        }
    
}




