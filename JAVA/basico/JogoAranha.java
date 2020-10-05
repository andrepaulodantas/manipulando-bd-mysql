/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author 15112683
 */
public class JogoAranha extends JFrame {
    
        ImageIcon iconparede = new ImageIcon(getClass().getResource(""));
        ImageIcon iconSpiderMexendo = new ImageIcon(getClass().getResource(""));
        ImageIcon iconSpiderParado = new ImageIcon(getClass().getResource(""));
    
        public JogoAranha(){
            editarJanela();
        }
        
        public void editarJanela(){//não retorna nada
        setTitle("Título da Janela");
        setSize(800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
            
        }
    
        public static void main(String[] args){
            new JogoAranha();
        }
    
}






