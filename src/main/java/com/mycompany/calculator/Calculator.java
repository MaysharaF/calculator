
package com.mycompany.calculator;

/**
 *
 * @author Mayshara Fernandes
 */

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        double n1, n2;
        int op;
        double result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("---- SELECIONE UMA OPERAÇÃO ----");
        System.out.println("[1] - SOMAR | [2] - SUBTRAIR | [3] MULTIPLICAR | [4] DIVIDIR");
        System.out.println("Digite sua opção: ");
        op = input. nextInt();
        
        System.out.println("Informe o primeiro valor: ");
        n1 = input.nextDouble();
        
        System.out.println("Informe o segundo valor: ");
        n2 = input.nextDouble();
        
        switch(op) {
            case 1:
                result = n1+n2;
                System.out.println("Resultado: "+result);
                break;
            case 2: 
                result = n1-n2;
                System.out.println("Resultado: "+result);
                break;
            case 3: 
                result = n1*n2;
                System.out.println("Resultado: "+result);
                break;
            case 4: 
                if(n1 < n2) {
                    System.out.println("Impossível de realizar o calculo");
                } else {
                    result = n1/n2;
                    System.out.println("Resultado: "+result);
                }
                break;
                
            default:
               System.out.println("OPERAÇÃO INVALIDA!");
        }
        
    }
}
