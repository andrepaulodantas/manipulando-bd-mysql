/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 15112683
 */
public class Tratamento {
        public static void main(String[] args){
            Scanner ler = new Scanner(System.in);
            try {
            //    int n = ler.nextInt();
                double n = ler.nextDouble();
                 System.out.println(30/n);
           // } catch(Exception erro){
            } catch(InputMismatchException erro){   
                System.out.println("Você só pode informar numeros interios! "+erro);
            } catch(ArithmeticException erro){
                System.out.println("Essa divisão não existe! "+erro);
            } finally{
                System.out.println("FIM");
        }
            
        }
   
}












