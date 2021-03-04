/*
2 - Faça um algoritmo que leia dois valores 
reais e informe se estes valores são iguais ou diferentes.
 */
package Aula3.Condicionais;
import java.util.Scanner;

public class Ex02 {


    public static void main(String[] args) {
        int valor1, valor2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor 1: ");
        valor1 = ler.nextInt();
        
        System.out.println("Digite o valor 2: ");
        valor2 = ler.nextInt();
        
        if(valor1 == valor2) {
            System.out.println("Os valor são iguais");
        }else{
            System.out.println("Os valores são diferentes");
        }
        
    }
    
}
