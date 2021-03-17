/*

Faça um programa para ler um vetor com valor indeterminado. 
Após isto, ler mais um número qualquer, calcular (soma) e escrever quantas 
vezes esse número aparece no vetor. Sempre imprimir na tela os processos do 
vetor.

 */
package Desafios;

import java.util.ArrayList;
import java.util.Scanner;


public class Desafio1 {


    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num1, num2 = 0;
        int quantidade = 0;
        
        ArrayList<Integer> vetor = new ArrayList<>();
        
        System.out.println("Digite a quantidade de números do Array, para ir \n"
                + "pro próximo passo, digite 0 ou um número negativo");
        
        do{
          System.out.println("Digite um número: ");
          num1 = ler.nextInt();
          
          vetor.add(num1);
        }while(num1 >= 0);
        
        int ultimo = vetor.size();
        vetor.remove(ultimo - 1);
        
        System.out.println("Beleza, os números até o momento são " + vetor);
        
        System.out.println("Manda mais um número ae: ");
        num2 = ler.nextInt();
        
        vetor.add(num2);
        
        System.out.println("Caraca, o número que tu digitou é o " + num2);      
        
        int soma = 0;  
        for(int numero : vetor){
            soma += numero;            
        }
        System.out.println("A soma de tudo aí é " + soma);
        
        
        if(num2 == num1) {
            quantidade++;
        }while(num2 == num1);
        
        System.out.println("O último numero que tu digitou apareceu " + quantidade++ + " vezes");
  
    }
    }
    
