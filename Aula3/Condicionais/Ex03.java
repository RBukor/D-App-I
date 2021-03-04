/*
3 - Faça um algoritmo que leia um valor 
inteiro e retorne se este valor é PAR ou ÍMPAR.
 */
package Aula3.Condicionais;
import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        int valor;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o valor: ");
        valor = ler.nextInt();
        
        if((valor % 2) == 0){
        System.out.println("O valor é par");
    }else{
            System.out.println("O valor é Ímpar");
    }
    }
    
}
