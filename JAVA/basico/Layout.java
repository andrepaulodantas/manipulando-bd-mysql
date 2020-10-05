/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author 15112683
 */
public class Layout extends JFrame implements ActionListener  {
    
     JMenuBar barra = new JMenuBar();
     JMenu menu1 = new JMenu("Opções");
     JMenu menu2 = new JMenu("Sair");
     JMenuItem item1 = new JMenuItem ("Exit");
    
     JButton jb = new JButton("Vídeo Aula");
     JButton jb2 = new JButton("SAIR");
     JTextField caixa = new JTextField(30);
  //  JCheckBox teste = new JCheckBox();
     JCheckBox teste = new JCheckBox("Show de bola", true);
     JRadioButton masculino = new JRadioButton("Masculino", true);
     JRadioButton feminino = new JRadioButton("Feminino", true);
     JComboBox<String> combo = new JComboBox<String>();
     
     ButtonGroup grupo = new ButtonGroup();
     
        public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==jb){
           JOptionPane.showMessageDialog(null, "Vídeo AulaActionListener");

        }
        
        if(e.getSource()==jb2){
            System.exit(0); //fechar algo
        }
        
    }
    
    public Layout(){
        
       setJMenuBar(barra);
       barra.add(menu1);
       barra.add(menu2);
       
       menu2.add(item1);
       item1.addActionListener(new ActionListener(){ //fechar janela
           @Override
           public void actionPerformed(ActionEvent e) {
        //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 System.exit(0); //fechar algo
           }
           
       });
       
       
        
        addKeyListener(new KeyAdapter(){
           
            public void keyPressed(KeyEvent e){ //capturar tecla
                char letra = e.getKeyChar();
                
                System.out.println(letra);
            //    letra.setText("BRAZIL");
            }
        });
        
        ImageIcon imagem = new ImageIcon(getClass().getResource("erro receita.png"));
        JLabel label = new JLabel(imagem);
        add(label);
        
        jb.addActionListener(this);
        jb2.addActionListener(this);
        
        setLayout(null);
        jb.setBounds(200, 30, 100, 60); // posicaO (x, y, LARGURA, ALTURA)
        jb2.setBounds(200, 100, 100, 60); // posicaO (x, y, LARGURA, ALTURA)
       // getContentPane().add(jb);
        add(jb);
        add(jb2);
        
        Font grande = new Font("Serif", Font.BOLD,50);
        JLabel legenda = new JLabel("Texto");
        legenda.setFont(grande);
        legenda.setText("Outro texto");
        legenda.setHorizontalAlignment(SwingConstants.CENTER);
        
             
          
        setLayout(new FlowLayout());
        
        grupo.add(masculino);
         grupo.add(feminino);
        
         add(combo);
         combo.addItem("NATAL");
         combo.addItem("NITERÓI");
         
        add(masculino);
        
         add(feminino);
        
        add(teste);
        
        add(caixa);
        caixa.setText(" SEJA BEM VINDO ");
        System.out.println(caixa.getText());
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(jb);
        add(jb2);
        
        setTitle("Título da Janela");
        setSize(1000, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
      //  setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Layout(); //iniciar a classe
         //  JOptionPane.showMessageDialog(null, "André e Juliana TrueLove");
     // String leitura = JOptionPane.showInputDialog("Qual seu nome?");
     int resposta = JOptionPane.showConfirmDialog(null, "Você é casado?");
     System.out.println(resposta);
     
     int n = (int)(Math.random()*100000);
     System.out.println(n);
        
        
    }

//    @Override
//   public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}

































































