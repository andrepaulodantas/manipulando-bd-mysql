/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import javax.swing.JOptionPane;
/**
 *
 * @author 15112683
 */
public class CaixadeDialogo {
    public static void main(String[] args){
      //  JOptionPane.showMessageDialog(null, "André e Juliana TrueLove");
     // String leitura = JOptionPane.showInputDialog("Qual seu nome?");
     int resposta = JOptionPane.showConfirmDialog(null, "Você é casado?");
     System.out.println(resposta);
    }
}








