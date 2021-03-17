/*

Leia um vetor de 20 posições. Contar e escrever quantos valores pares e ímpares ele possui. Imprimir na tela

 */
package Desafios;

import java.util.Scanner;
import java.util.Arrays;

public class Desafio2 {


    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite os números do vetor: ");
            vetor[i] = ler.nextInt(); 
            }
        
            int par = 0;
            int impar = 0;
            
            for(int i = 0; i < vetor.length; i++ ) {
                if(vetor[i] % 2 == 0) {
                    par++;
                }else{
                    impar++;
                }
            } 
            
            
        System.out.println("Beleza, os números que tu digitou foram" + Arrays.toString(vetor));
        System.out.println("O vetor possui " + impar + " numeros ímpares");
        System.out.println("O vetor possui " + par + " numeros pares");
        
 
    }
    }


