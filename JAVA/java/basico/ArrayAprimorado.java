/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.util.ArrayList;

/**
 *
 * @author 15112683
 */
public class ArrayAprimorado {
    public static void main(String[] args){
        ArrayList<String> nomes =  new ArrayList<String>();
        nomes.add("André");
        nomes.add("Juliana");
        nomes.remove(0);
        System.out.println(nomes.toString());
        System.out.println(nomes.get(0));
        System.out.println(nomes.isEmpty());
        System.out.println(nomes.contains(0));
    }
}






