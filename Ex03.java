/*

 */
package Aula2;
import java.util.Scanner;


public class Ex03 {
    
    Double numerozinho;
    
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite o valor do numerozinho: ");
        Double numerozinho = ler.nextDouble();
        
        System.out.println("O Dobro do numerozinho é: " + (numerozinho * 2));
        
        System.out.println("O Triplo do Dobro do numerozinho é: " + (numerozinho * 2) * 3);
        
        System.out.println("A metade do triplo do dobro do numerozinho é: " + ((numerozinho * 2) * 3) /2);
        
        System.out.println("O quadrado do numerozinho é: " + (numerozinho * numerozinho));
        
        System.out.println("A quinta parte do dobro do numerozinho é: " + (numerozinho * 2) / 5);
    
    }
    
}
