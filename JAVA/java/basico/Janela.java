/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import javax.swing.JFrame;

/**
 *
 * @author 15112683
 */
public class Janela extends JFrame { //metodo classe
    public Janela(){ //construtor
        //JFrame jf = new JFrame(): //metodo
        setTitle("Título da Janela");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Janela(); //iniciar a classe
        
        
    }

    
}





