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
    
   // JTextField num1 = new JTextField();
  //  JTextField num2 = new JTextField();
 //   JLabel mais = new JLabel("   x");
 //   JLabel resultado = new JLabel();
 //   JButton soma = new JButton(" = ");
    
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JLabel multiplicacao = new JLabel("   x");
    JButton igual = new JButton(" = ");
    JLabel resultado = new JLabel("");
    //porcentragem
    JLabel percent = new JLabel(" % ");
    JTextField porcentagem = new JTextField();
 //   JButton igual = new JButton(" = ");
    JLabel porceentresult = new JLabel("");
  
    
   Font fonte = new Font("Arial", Font.BOLD, 50);
    
    ProgramaSoma(){
        
        igual.addActionListener(new ActionListener(){//adiconar ação a um botão
           @Override
           public void actionPerformed(ActionEvent e){
              int n1 = Integer.parseInt(num1.getText());//conversão de texto para inteiro
              int n2 = Integer.parseInt(num2.getText());//conversão de texto para inteiro
              int multiplicacao = n1*n2;
              resultado.setText(multiplicacao + "");//conveter para string (concatenação)
              
              int n3 = Integer.parseInt(porcentagem.getText());//conversão de texto para inteiro
              double percent;
              percent = (double) (multiplicacao*n3)/100;
              porceentresult.setText(percent + "");//conveter para string (concatenação)
              
           } 
       });
        
    
        
   //     igualporcent.addActionListener(new ActionListener(){//adiconar ação a um botão
   //        @Override
  //         public void actionPerformed(ActionEvent e){
                        
            
 //          } 
 //      });
          
         
   //        @Override
  //          public void actionPerformed(ActionEvent e) {
  //              throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //          }
             
        
        
        setLayout(new GridLayout(1,5));
        add(num1);
        add(multiplicacao);
        add(num2);
        add(igual);
        add(resultado);
        
        add(percent);
        add(porcentagem);
        add(igual);
        add(porceentresult);
            
        num1.setFont(fonte);
        multiplicacao.setFont(fonte);
        num2.setFont(fonte);
        igual.setFont(fonte);
        resultado.setFont(fonte);
        
        percent.setFont(fonte);
        porcentagem.setFont(fonte);
        igual.setFont(fonte);
        porceentresult.setFont(fonte);
        
        setSize(1500,100); //largura
        setTitle("Programa de Soma e Porcentagem"); //título
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar o programa ao clicar no X
        setLocationRelativeTo(null);// deixar a janela centralizada
        setVisible(true); // janela visivél
    }
    
    public static void main(String[] args){
        new ProgramaSoma();
        }
}




















































