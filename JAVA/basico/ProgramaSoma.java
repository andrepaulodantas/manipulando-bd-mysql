/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 15112683
 */
public class ProgramaSoma extends JFrame {
    
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JLabel mais = new JLabel("   x");
    JLabel resultado = new JLabel();
    JButton soma = new JButton(" = ");
    
    Font fonte = new Font("Arial", Font.BOLD, 50);
    
    ProgramaSoma(){
        
        soma.addActionListener(new ActionListener(){//adiconar ação a um botão
           @Override
           public void actionPerformed(ActionEvent e){
              int n1 = Integer.parseInt(num1.getText());//conversão de texto para inteiro
              int n2 = Integer.parseInt(num2.getText());//conversão de texto para inteiro
              int multiplicacao = n1*n2;
              resultado.setText(multiplicacao + "");//conveter para string (concatenação)
           } 

   //        @Override
  //          public void actionPerformed(ActionEvent e) {
  //              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //          }
        });
        
        setLayout(new GridLayout(1,5));
        add(num1);
        add(mais);
        add(num2);
        add(soma);
        add(resultado);
            
        num1.setFont(fonte);
        mais.setFont(fonte);
        num2.setFont(fonte);
        soma.setFont(fonte);
        resultado.setFont(fonte);
        
        setSize(600,100); //largura
        setTitle("Programa de Soma"); //título
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar o programa ao clicar no X
        setLocationRelativeTo(null);// deixar a janela centralizada
        setVisible(true); // janela visivél
    }
    
    public static void main(String[] args){
        new ProgramaSoma();
    }
}



















