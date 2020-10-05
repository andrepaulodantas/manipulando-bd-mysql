/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author 15112683
 */
public class JogoAranha extends JFrame {
    
        ImageIcon iconparede = new ImageIcon(getClass().getResource("parede.jpg")); // recuperar a classe e recuperar o caminho
        ImageIcon iconSpiderMexendo = new ImageIcon(getClass().getResource("homemaranha.gif")); // recuperar a classe e recuperar o caminho
        ImageIcon iconSpiderParado = new ImageIcon(getClass().getResource("homemaranha.jpg")); // recuperar a classe e recuperar o caminho
        
        JLabel lParede = new JLabel(iconparede);
        JLabel lSpider = new JLabel(iconSpiderParado);
        
        int posSpiderX= 300;
        int posSpiderY= 300;
    
        public JogoAranha(){
            editarJanela();
            editarComponentes();
            addMovimento();
        }
        
        public void addMovimento(){
            addKeyListener(new KeyListener(){
                
                   
                
                public void keyPressed(KeyEvent e){
                    System.out.println("OK");
                }

               
                public void keyTyped(KeyEvent e) {
                }
               
                          
                public void keyReleased(KeyEvent e) {
                  
                }

            });
                    
        }
        
        public void editarComponentes(){
            lParede.setBounds(0, 0, 800, 700);
            lSpider.setBounds(posSpiderX, posSpiderY, 223, 320); //X, Y, tamanhoImagem, LarguraImagem
        }
        
        private void editarJanela(){//não retorna nada
        setTitle("Jogo Aranha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        add(lSpider);
        add(lParede);
            
        }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
            new JogoAranha();
        }
    
}




















