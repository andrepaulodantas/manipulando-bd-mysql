/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import static java.awt.PageAttributes.MediaType.C;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class LerArquivo {
    public static void main(String[] args){
        
        Path caminho = Paths.get("C:/Users/andre/Documents/hino.txt"); //criar o objetivo path para achar o caminho
        try{ //tratar erros
            byte[] texto = Files.readAllBytes(caminho); //arquivo files para ler todos os bytes do arquivo, retornando um array de bytes
            String leitura = new String(texto); //criando uma string para ler os valores do caminho
            
            JOptionPane.showMessageDialog(null, leitura);//para ler em uma caixa de dialogo
        } catch(Exception erro) {
            
        }
    }
    
}







