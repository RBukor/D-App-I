/*
4 - Faça um algoritmo que leia dois valores reais e exiba ao final qual dos dois é o maior.
 */
package Aula3.Condicionais;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        
        int valor1, valor2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        valor1 = ler.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        valor2 = ler.nextInt();
        
        if(valor1 > valor2){
            System.out.println("o " + valor1 + " é o maior valor ");
        }else if(valor2 > valor1){
            System.out.println("o " + valor2 + " é o maior valor");
        }else{
            System.out.println("Os valores são iguais");
        }
 
    }
    
}
