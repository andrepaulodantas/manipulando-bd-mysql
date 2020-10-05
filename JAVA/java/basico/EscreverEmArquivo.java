/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

//import static java.awt.PageAttributes.MediaType.C;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
//import static sun.security.krb5.Confounder.bytes;

/**
 *
 * @author andre
 */
public class EscreverEmArquivo {
    public static void main(String[] args){
        
            Path caminho = Paths.get("C:/Users/andre/Documents/seraquedacerto.txt"); //criar o objetivo path para achar o caminho
      //  
            String texto = JOptionPane.showInputDialog("O que quer escrever noo bloco de notas?"); //criando uma string via JOptionPane para ler os valores do caminho
      //   String texto = "sera que da certo?"; //criando uma string para ler os valores do caminho
            byte[] textoEmByte = texto.getBytes(); //arquivo files para ler todos os bytes do arquivo, retornando um array de bytes
            try{ //tratar erros
            Files.write(caminho, textoEmByte); // converteu em array de bytes
    //        JOptionPane.showMessageDialog(null, leitura);//para ler em uma caixa de dialogo
       } catch(Exception erro) {
            
       }
    }
    
}






