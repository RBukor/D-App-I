/*
1 - Crie um programa que leia um número inteiro e retorne se o 
mesmo é positivo ou negativo.
Observação: Para a resolução deste problema 
considera que o número zero é um valor positivo.
 */
package Aula3.Condicionais;
import java.util.Scanner;


public class Ex01 {


    public static void main(String[] args) {
        
        int valor;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor: ");
        valor = ler.nextInt();
        
        if(valor >= 0) {
            System.out.println("O Valor é POSITIVO");
        }else{
            System.out.println("O Valor é NEGATIVO");     
}
}    
}
