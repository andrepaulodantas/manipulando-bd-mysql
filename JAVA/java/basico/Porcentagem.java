/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */

import java.util.Scanner;

public class Porcentagem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int codigo;

    int quantidade1 = 0;
    int quantidade2 = 0;
    int quantidade3 = 0;

    double multiplicador1 = 1.5;
    double multiplicador2 = 3;
    double multiplicador3 = 5;

    double total1 = 0;
    double total2 = 0;
    double total3 = 0;

    do {
      double consumido;
      int tipo;
      double custoTotal = 0;
      double quantidadeTotal;
      double porcentagem3;
      double media2 = 0;

      System.out.println("Digite o código do consumidor: ");
      codigo = sc.nextInt();

      System.out.println("Digite a quantidade consumida em KWh: ");
      consumido = sc.nextDouble();

      System.out.println("Digite o tipo de consumidor: ");
      tipo = sc.nextInt();

      switch (tipo) {
        case 1:
          quantidade1 = quantidade1 + 1;
          custoTotal = multiplicador1 * consumido;
          total1 = total1 + custoTotal;
          break;
        case 2:
          quantidade2 = quantidade2 + 1;
          custoTotal = multiplicador2 * consumido;
          total2 = total2 + custoTotal;
          break;
        case 3:
          quantidade3 = quantidade3 + 1;
          custoTotal = multiplicador3 * consumido;
          total3 = total3 + custoTotal;
          break;
      }

      System.out.println("Valor da conta do usuário " + codigo + " é: " + custoTotal);

      quantidadeTotal = quantidade1 + quantidade2 + quantidade3;
      media2 = total2 / quantidade2;
      porcentagem3 = quantidade3 / quantidadeTotal * 100;

      System.out.println("Total tipo 1: " + total1);
      System.out.println("Total tipo 2: " + total2);
      System.out.println("Total tipo 3: " + total3);
      System.out.println("Media custo tipo 2: " + media2);
      System.out.println("Tipo 3 (em porcentagem): " + porcentagem3 + "%");
    } while (codigo != 0);
  }
}

