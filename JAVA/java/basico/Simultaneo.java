/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author 15112683
 */
public class Simultaneo extends JFrame{
    JLabel tempo = new JLabel("0");
    JLabel idade = new JLabel();
    int segundos = 0;
    
    public Simultaneo(){
        editarLayout();
        //   contarTempo();
        contarTempo obj = new contarTempo(); // paralelismo
        obj.start();       
        mostrarMensagem();
        obj.stop(); // parar a contagem
     
     
       
    }
    
    public void editarLayout(){
        Font fonte = new Font("Arial ",Font.BOLD, 50);
        Font fonte2 = new Font("Arial ",Font.BOLD, 50);
        
        add(BorderLayout.NORTH, tempo);
        add(BorderLayout.CENTER, idade);
        
        tempo.setHorizontalAlignment(SwingConstants.CENTER);
        idade.setHorizontalAlignment(SwingConstants.CENTER);
        idade.setFont(fonte);
        tempo.setFont(fonte2);  
        
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //setResizable(false);
        setVisible(true);
    }
    
  //  public void contarTempo(){
  //      while(true){
  //          try {Thread.sleep(1000);} catch (Exception e){}
  //          segundos++;
  //          tempo.setText(segundos+"");
  //      }
  //  }
    
    public void mostrarMensagem(){
        int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
        int resultado = anoAtual - anoNasc;
        idade.setText("Sua idade é: "+resultado);
        JOptionPane.showMessageDialog(null, "Você gastou "+segundos+" segundos para responder!");
        
    }
    
    public static void main(String[] args){
        new Simultaneo();
    }
    
    public class contarTempo extends Thread{ //paralelismo
        public void run(){
              while(true){
                 try {Thread.sleep(1000);} catch (Exception e){}
                 segundos++;
                 tempo.setText(segundos+"");
             }
        }
    }
    
}







