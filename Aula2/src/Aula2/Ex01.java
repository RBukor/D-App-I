/*

 */
package Aula2;
import java.util.Scanner;


public class Ex01 {
    
    String nome;
    double nota1, nota2, nota3;
    
    static Scanner ler = new Scanner(System.in);
    


    public static void main(String[] args) {
        System.out.println("Digite seu nome");
        String nome = ler.nextLine();
        
        System.out.println("Digite sua primeira nota ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Digite sua segunda nota ");
        double nota2 = ler.nextDouble();
        
        System.out.println("Digite sua terceira nota ");
        double nota3 = ler.nextDouble();
        
        System.out.println("Olá " + nome);
        
        System.out.println("A média aritmética de sua nota é " + 
        (nota1 + nota2 + nota3) / 3);

    }
    
}
