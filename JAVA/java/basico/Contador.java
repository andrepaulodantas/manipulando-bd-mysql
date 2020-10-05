/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author 15112683
 */
public class Contador extends JFrame {
    
    Font fonte = new Font("Arial", Font.BOLD, 150);
    JLabel numero = new JLabel("0");
    
    public Contador(){
    numero.setFont(fonte);
    numero.setHorizontalAlignment(SwingConstants.CENTER);
    add(numero);
    setTitle("Somando");
    setSize(300,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
      
}

public void intervalo(){
    int n = 0;
    while(true){
    numero.setText(n+"");
    n++;
    try{Thread.sleep(1000);}catch(Exception erro){}
   }
}

public static void main(String[] args){
    Contador obj = new Contador();
    obj.intervalo();
    }

}





