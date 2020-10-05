/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 15112683
 */
public class Botao extends JFrame implements ActionListener { //metodo classe
    
     JButton jb = new JButton("Mensagem");
     JButton jb2 = new JButton("Sair");
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==jb){
           JOptionPane.showMessageDialog(null, "Vídeo AulaActionListener");

        }
        
        if(e.getSource()==jb2){
            System.exit(0);
        }
        
    }
    
    
    public Botao(){ //construtor
        //JFrame jf = new JFrame(): //metodo
        JButton botao = new JButton("Teste");
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, botao);
        
        jb.addActionListener(this);
        jb2.addActionListener(this);
        
        setLayout(null);
        jb.setBounds(200, 30, 100, 60); // posicaO (x, y, LARGURA, ALTURA)
        jb2.setBounds(200, 100, 100, 60); // posicaO (x, y, LARGURA, ALTURA)
       // getContentPane().add(jb);
        add(jb);
        add(jb2);
        
        setTitle("Título da Janela");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Botao(); //iniciar a classe
        
        
    }

    
}





























